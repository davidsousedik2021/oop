package boxes;

public class Book implements Item {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book Title: " + title);
    }
}
