public class Book extends Item implements Borrowable {

    private String author;
    private boolean borrowed;
    private int dueDays;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
        this.borrowed = false;
        this.dueDays = 0;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void borrow() {

        if (borrowed) {
            System.out.println("Book is already borrowed.");
            return;
        }

        borrowed = true;
        dueDays = 14;

        System.out.println(
                "\"" + getTitle() + "\" borrowed successfully."
        );

        System.out.println("Due in " + dueDays + " days.");
    }

    @Override
    public void returnItem() {

        if (!borrowed) {
            System.out.println("Book is not currently borrowed.");
            return;
        }

        borrowed = false;
        dueDays = 0;

        System.out.println(
                "\"" + getTitle() + "\" returned successfully."
        );
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void displayDetails() {

        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println(
                "Status: " + (borrowed ? "Borrowed" : "Available")
        );

        if (borrowed) {
            System.out.println("Due in: " + dueDays + " days");
        }
    }
}