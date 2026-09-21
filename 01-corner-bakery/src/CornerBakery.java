import java.util.Scanner;

public class CornerBakery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double CUPCAKE_PRICE = 2.50;
        final double CAKE_PRICE = 18.00;
        final double DISCOUNT_RATE = 0.10;

        System.out.print("\nEnter number of cupcakes: ");
        int cupcakeQuantity = scanner.nextInt();

        System.out.print("Enter number of cakes: ");
        int cakeQuantity = scanner.nextInt();

        double cupcakeSubtotal = cupcakeQuantity * CUPCAKE_PRICE;
        double cakeSubtotal = cakeQuantity * CAKE_PRICE;

        double cupcakeDiscount = 0;

        if (cupcakeQuantity >= 6) {
            cupcakeDiscount = cupcakeSubtotal * DISCOUNT_RATE;
        }

        double grandTotal = cupcakeSubtotal - cupcakeDiscount + cakeSubtotal;

        System.out.println("\n==========================================");
        System.out.println("       CORNER BAKERY");
        System.out.println("==========================================");

        System.out.printf("Cupcakes (%d x M%.2f): M%.2f%n",
                cupcakeQuantity,
                CUPCAKE_PRICE,
                cupcakeSubtotal);

        System.out.printf("Cupcake discount:       -M%.2f%n",
                cupcakeDiscount);

        System.out.printf("Cakes (%d x M%.2f):     M%.2f%n",
                cakeQuantity,
                CAKE_PRICE,
                cakeSubtotal);

        System.out.println("------------------------------");

        System.out.printf("GRAND TOTAL:            M%.2f%n",
                grandTotal);

        System.out.println("==============================");

        scanner.close();
    }
}