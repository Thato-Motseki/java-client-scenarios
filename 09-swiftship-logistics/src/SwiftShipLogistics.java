import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SwiftShipLogistics {

    private static final String FILE_NAME = "shipments.ser";

    public static void main(String[] args) {
        List<PackageRecord> shipments = new ArrayList<>();

        shipments.add(new PackageRecord("SS-1042", "Johannesburg", "A. Mokoena",
                PackageStatus.IN_TRANSIT, 14.5));
        shipments.add(new PackageRecord("SS-2088", "Cape Town", "L. Ndlovu",
                PackageStatus.DELAYED, 8.2));
        shipments.add(new PackageRecord("SS-3116", "Durban", "S. Khumalo",
                PackageStatus.DELIVERED, 21.0));

        saveShipments(shipments);

        List<PackageRecord> loadedShipments = loadShipments();

        System.out.println("=====================================");
        System.out.println("      SWIFTSHIP LOGISTICS");
        System.out.println("     PACKAGE TRACKING RECORDS");
        System.out.println("=====================================");

        if (loadedShipments.isEmpty()) {
            System.out.println("No package records were found.");
            return;
        }

        for (PackageRecord record : loadedShipments) {
            System.out.printf("Tracking: %-12s | Destination: %-15s | Customer: %-18s | Status: %-10s | Weight: %.1f kg%n",
                    record.getTrackingNumber(),
                    record.getDestination(),
                    record.getCustomerName(),
                    record.getStatus(),
                    record.getWeightKg());
        }

        System.out.println("=====================================");
    }

    private static void saveShipments(List<PackageRecord> shipments) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(shipments);
            System.out.println("Package records saved to " + FILE_NAME);
        } catch (IOException exception) {
            System.err.println("Unable to save shipment data: " + exception.getMessage());
        }
    }

    private static List<PackageRecord> loadShipments() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(file))) {
            Object data = inputStream.readObject();
            if (data instanceof List<?>) {
                return (List<PackageRecord>) data;
            }
        } catch (IOException | ClassNotFoundException exception) {
            System.err.println("Unable to read shipment data: " + exception.getMessage());
        }

        return new ArrayList<>();
    }
}
