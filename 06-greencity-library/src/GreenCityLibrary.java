import java.util.Scanner;

public class GreenCityLibrary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        // Add sample library items
        library.addItem(
                new Book(
                        101,
                        "Clean Code",
                        "Robert C. Martin"
                )
        );

        library.addItem(
                new Book(
                        102,
                        "Effective Java",
                        "Joshua Bloch"
                )
        );

        library.addItem(
                new Book(
                        103,
                        "Java: The Complete Reference",
                        "Herbert Schildt"
                )
        );

        library.addItem(
                new ReferenceBook(
                        201,
                        "Computer Science Encyclopedia",
                        "Computer Science"
                )
        );

        library.addItem(
                new ReferenceBook(
                        202,
                        "World History Encyclopedia",
                        "History"
                )
        );

        boolean running = true;

        while (running) {

            System.out.println("\n======================================");
            System.out.println("          GREEN CITY LIBRARY");
            System.out.println("======================================");

            System.out.println("1. Display all items");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Find an item");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");

            try {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        library.displayAllItems();
                        break;

                    case 2:

                        System.out.print("Enter item ID: ");
                        int borrowId = scanner.nextInt();

                        library.borrowItem(borrowId);
                        break;

                    case 3:

                        System.out.print("Enter item ID: ");
                        int returnId = scanner.nextInt();

                        library.returnItem(returnId);
                        break;

                    case 4:

                        System.out.print("Enter item ID: ");
                        int searchId = scanner.nextInt();

                        Item item = library.findItemById(searchId);

                        if (item != null) {

                            System.out.println(
                                    "\nItem found:"
                            );

                            item.displayDetails();

                        } else {

                            System.out.println(
                                    "Item not found."
                            );
                        }

                        break;

                    case 5:
                        running = false;
                        break;

                    default:
                        System.out.println(
                                "Invalid option."
                        );
                }

            } catch (java.util.InputMismatchException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                scanner.nextLine();
            }
        }

        System.out.println(
                "\nThank you for using GreenCity Library."
        );

        scanner.close();
    }
}