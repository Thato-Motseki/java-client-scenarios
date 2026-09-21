import java.util.ArrayList;

public class QuickMart {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        // Adding products to the inventory
        products.add(new Product("Milk", 8, 10));
        products.add(new Product("Bread", 15, 10));
        products.add(new Product("Rice", 5, 8));
        products.add(new Product("Sugar", 12, 10));
        products.add(new Product("Cooking Oil", 4, 6));
        products.add(new Product("Flour", 20, 10));
        products.add(new Product("Eggs", 6, 12));
        products.add(new Product("Coffee", 9, 5));
        products.add(new Product("Tea", 3, 7));
        products.add(new Product("Cereal", 14, 8));

        int reorderCount = 0;

        System.out.println("\n==============================================");
        System.out.println("            QUICKMART STOCK REPORT");
        System.out.println("==============================================\n");

        System.out.printf("%-18s %-10s %-12s %-10s%n",
                "Product", "Stock", "Threshold", "Status");

        System.out.println("----------------------------------------------");

        for (Product product : products) {

            String status;

            if (product.getQuantity() < product.getReorderThreshold()) {
                status = "REORDER";
                reorderCount++;
            } else {
                status = "OK";
            }

            System.out.printf("%-18s %-10d %-12d %-10s%n",
                    product.getName(),
                    product.getQuantity(),
                    product.getReorderThreshold(),
                    status);
        }

        System.out.println("----------------------------------------------");

        System.out.println("Products requiring reorder: " + reorderCount);

        System.out.println("==============================================");
    }
}