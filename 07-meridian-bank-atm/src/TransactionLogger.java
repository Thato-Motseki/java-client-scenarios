import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLogger {

    private static final String FILE_NAME = "transactions.txt";

    public static void logTransaction(
            String accountNumber,
            String transactionType,
            double amount,
            String status,
            String message) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String timestamp =
                LocalDateTime.now().format(formatter);

        String logEntry = String.format(
                "[%s] Account: %s | Type: %s | Amount: M%.2f | Status: %s | %s%n",
                timestamp,
                accountNumber,
                transactionType,
                amount,
                status,
                message
        );

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            writer.write(logEntry);

        } catch (IOException e) {

            System.out.println(
                    "Warning: Could not write transaction log."
            );
        }
    }
}