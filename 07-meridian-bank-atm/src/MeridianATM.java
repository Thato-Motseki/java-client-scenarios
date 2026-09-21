import java.util.InputMismatchException;
import java.util.Scanner;

public class MeridianATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account = new Account(
                "10001",
                "Thato",
                2500.00
        );

        boolean running = true;

        while (running) {

            displayMenu(account);

            try {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        displayBalance(account);
                        break;

                    case 2:
                        handleDeposit(scanner, account);
                        break;

                    case 3:
                        handleWithdrawal(scanner, account);
                        break;

                    case 4:
                        displayAccountDetails(account);
                        break;

                    case 5:
                        running = false;
                        break;

                    default:
                        System.out.println(
                                "Invalid option. Please choose 1-5."
                        );
                }

            } catch (InputMismatchException | InvalidTransactionException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                scanner.nextLine();
            }
        }

        System.out.println("\nThank you for using Meridian Bank ATM.");

        scanner.close();
    }


    public static void displayMenu(Account account) {

        System.out.println("\n====================================");
        System.out.println("          MERIDIAN BANK ATM");
        System.out.println("====================================");
        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("------------------------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Account Details");
        System.out.println("5. Exit");
        System.out.println("------------------------------------");
        System.out.print("Choose an option: ");
    }


    public static void displayBalance(Account account) {

        System.out.printf(
                "\nCurrent balance: M%.2f%n",
                account.getBalance()
        );
    }


    public static void handleDeposit(
            Scanner scanner,
            Account account) throws InvalidTransactionException {

        System.out.print("\nEnter deposit amount: M");

        try {

            double amount = scanner.nextDouble();

            account.deposit(amount);

            TransactionLogger.logTransaction(
                    account.getAccountNumber(),
                    "DEPOSIT",
                    amount,
                    "SUCCESS",
                    "Deposit completed."
            );

            System.out.printf(
                    "Deposit successful. New balance: M%.2f%n",
                    account.getBalance()
            );

        } catch (InputMismatchException e) {

            System.out.println(
                    "Invalid amount. Please enter a number."
            );

            scanner.nextLine();

            TransactionLogger.logTransaction(
                    account.getAccountNumber(),
                    "DEPOSIT",
                    0,
                    "FAILED",
                    "Invalid numeric input."
            );
        }
    }


    public static void handleWithdrawal(
            Scanner scanner,
            Account account) throws InvalidTransactionException {

        System.out.print("\nEnter withdrawal amount: M");

        try {

            double amount = scanner.nextDouble();

            account.withdraw(amount);

            TransactionLogger.logTransaction(
                    account.getAccountNumber(),
                    "WITHDRAWAL",
                    amount,
                    "SUCCESS",
                    "Withdrawal completed."
            );

            System.out.printf(
                    "Withdrawal successful. New balance: M%.2f%n",
                    account.getBalance()
            );

        } catch (InputMismatchException e) {

            System.out.println(
                    "Invalid amount. Please enter a number."
            );

            scanner.nextLine();

            TransactionLogger.logTransaction(
                    account.getAccountNumber(),
                    "WITHDRAWAL",
                    0,
                    "FAILED",
                    "Invalid numeric input."
            );
        }
    }


    public static void displayAccountDetails(Account account) {

        System.out.println("\n--------- ACCOUNT DETAILS ---------");

        System.out.println(
                "Account number: " + account.getAccountNumber()
        );

        System.out.println(
                "Account holder: " + account.getAccountHolder()
        );

        System.out.printf(
                "Balance: M%.2f%n",
                account.getBalance()
        );

        System.out.println("-----------------------------------");
    }
}