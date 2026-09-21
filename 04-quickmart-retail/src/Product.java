public class Product {

    private String name;
    private int quantity;
    private int reorderThreshold;

    public Product(String name, int quantity, int reorderThreshold) {
        this.name = name;
        this.quantity = quantity;
        this.reorderThreshold = reorderThreshold;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }
}