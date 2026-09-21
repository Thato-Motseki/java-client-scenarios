import java.util.InputMismatchException;
import java.util.Scanner;

public class DriveEasy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n====================================");
            System.out.println("       DRIVE-EASY CAR RENTAL");
            System.out.println("====================================");

            System.out.println("1. Economy  - M400/day");
            System.out.println("2. SUV      - M650/day");
            System.out.println("3. Luxury   - M950/day");
            System.out.println("4. Exit");

            System.out.print("Select car type: ");

            try {

                int choice = scanner.nextInt();

                if (choice == 4) {
                    running = false;
                    continue;
                }

                CarType selectedType;

                switch (choice) {
                    case 1:
                        selectedType = CarType.ECONOMY;
                        break;

                    case 2:
                        selectedType = CarType.SUV;
                        break;

                    case 3:
                        selectedType = CarType.LUXURY;
                        break;

                    default:
                        System.out.println("Invalid car type.");
                        continue;
                }

                System.out.print("Enter rental period in days: ");

                int rentalDays = scanner.nextInt();

                Car car = new Car(selectedType);

                double totalCost = car.calculateRentalCost(rentalDays);

                System.out.println("\n--------- RENTAL SUMMARY ---------");

                System.out.println(
                        "Car type: " + selectedType.getDisplayName()
                );

                System.out.println(
                        "Daily rate: M" +
                        String.format("%.2f", selectedType.getDailyRate())
                );

                System.out.println(
                        "Rental period: " + rentalDays + " days"
                );

                if (rentalDays >= 7) {
                    System.out.println("Discount: 10%");
                } else {
                    System.out.println("Discount: None");
                }

                System.out.printf(
                        "Total cost: M%.2f%n",
                        totalCost
                );

                System.out.println("----------------------------------");

            } catch (InvalidRentalException e) {

                System.out.println("Rental error: " + e.getMessage());

            } catch (InputMismatchException e) {

                System.out.println(
                        "Invalid input. Please enter numbers only."
                );

                scanner.nextLine();
            }
        }

        System.out.println("\nThank you for using Drive-Easy.");

        scanner.close();
    }
}