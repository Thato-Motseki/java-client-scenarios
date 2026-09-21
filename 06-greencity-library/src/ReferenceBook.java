public class ReferenceBook extends Item {

    private String subject;

    public ReferenceBook(int id, String title, String subject) {
        super(id, title);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayDetails() {

        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Subject: " + subject);
        System.out.println("Status: Reference Only");
    }
}