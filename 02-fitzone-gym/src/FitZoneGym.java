import java.util.Scanner;

public class FitZoneGym {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continueProgram = null;

        do {

            System.out.println("\n==============================");
            System.out.println("         FITZONE GYM");
            System.out.println("==============================");

            System.out.println("1. Standard - M450/month");
            System.out.println("\n2. Premium  - M700/month");

            System.out.print("Select membership type: ");
            int membershipType = scanner.nextInt();

            //  membership type
            if (membershipType != 1 && membershipType != 2) {
                System.out.println("Invalid membership type.");
                continue;
            }

            System.out.print("Are you a student? (yes/no): ");
            String studentStatus = scanner.next();

            System.out.print("Enter contract length in months: ");
            int contractLength = scanner.nextInt();

            //  contract length
            if (contractLength <= 0) {
                System.out.println("Contract length must be greater than 0.");
                continue;
            }

            boolean isStudent = studentStatus.equalsIgnoreCase("yes");

            double monthlyFee = calculateMonthlyFee(
                    membershipType,
                    isStudent,
                    contractLength
            );

            double totalPrice = monthlyFee * contractLength;

            //  quotation
            System.out.println("\n--------- MEMBERSHIP QUOTE ---------");

            if (membershipType == 1) {
                System.out.println("Membership: Standard");
            } else {
                System.out.println("Membership: Premium");
            }

            System.out.println("Student: " + (isStudent ? "Yes" : "No"));
            System.out.println("Contract: " + contractLength + " months");

            System.out.printf("Monthly fee: M%.2f%n", monthlyFee);
            System.out.printf("Total price: M%.2f%n", totalPrice);

            System.out.println("------------------------------------");

            System.out.print("\nProcess another customer? (yes/no): ");
            continueProgram = scanner.next();

        } while (continueProgram.equalsIgnoreCase("yes"));

        System.out.println("\nThank you for using FitZone Gym.");

        scanner.close();
    }


    public static double calculateMonthlyFee(
            int membershipType,
            boolean isStudent,
            int contractLength) {

        final double STANDARD_FEE = 450.00;
        final double PREMIUM_FEE = 700.00;
        final double STUDENT_DISCOUNT = 0.15;
        final double ANNUAL_DISCOUNT = 5.00;

        double monthlyFee;

        //  membership price
        if (membershipType == 1) {
            monthlyFee = STANDARD_FEE;
        } else {
            monthlyFee = PREMIUM_FEE;
        }

        //  student discount
        if (isStudent) {
            monthlyFee = monthlyFee - (monthlyFee * STUDENT_DISCOUNT);
        }

        // M5 monthly discount for 12-month contracts
        if (contractLength == 12) {
            monthlyFee = monthlyFee - ANNUAL_DISCOUNT;
        }

        return monthlyFee;
    }
}