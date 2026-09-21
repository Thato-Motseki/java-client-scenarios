import java.util.ArrayList;

public class Library {

    private ArrayList<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);

        System.out.println(
                "\"" + item.getTitle() + "\" added to the library."
        );
    }

    public void displayAllItems() {

        System.out.println("\n======================================");
        System.out.println("          GREEN CITY LIBRARY");
        System.out.println("======================================");

        if (items.isEmpty()) {
            System.out.println("No items in the library.");
            return;
        }

        for (Item item : items) {

            System.out.println("\n--------------------------------------");

            item.displayDetails();
        }

        System.out.println("--------------------------------------");
    }

    public Item findItemById(int id) {

        for (Item item : items) {

            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }

    public void borrowItem(int id) {

        Item item = findItemById(id);

        if (item == null) {
            System.out.println("Item not found.");
            return;
        }

        if (item instanceof Borrowable) {

            Borrowable borrowable = (Borrowable) item;

            borrowable.borrow();

        } else {

            System.out.println(
                    "This item cannot be borrowed."
            );
        }
    }

    public void returnItem(int id) {

        Item item = findItemById(id);

        if (item == null) {
            System.out.println("Item not found.");
            return;
        }

        if (item instanceof Borrowable) {

            Borrowable borrowable = (Borrowable) item;

            borrowable.returnItem();

        } else {

            System.out.println(
                    "This item cannot be returned."
            );
        }
    }
}