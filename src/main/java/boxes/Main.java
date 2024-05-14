package boxes;

public class Main {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.setItem(new Book("Introduction to Java"));

        Box<Pen> penBox = new Box<>();
        penBox.setItem(new Pen("Blue"));

        bookBox.getItem().display();
        penBox.getItem().display();

        MultiBox<Book> bookMultiBox = new MultiBox<>();
        bookMultiBox.addItem(new Book("Introduction to Java"));
        bookMultiBox.addItem(new Book("Advanced Java Programming"));

        System.out.println("Books in bookMultiBox:");
        for (Book book : bookMultiBox.getItems()) {
            book.display();
        }

        MultiBox<Pen> penMultiBox = new MultiBox<>();
        penMultiBox.addItem(new Pen("Blue"));
        penMultiBox.addItem(new Pen("Red"));

        System.out.println("Pens in penMultiBox:");
        for (Pen pen : penMultiBox.getItems()) {
            pen.display();
        }

        MultiBox<Item> multiMultiBox = new MultiBox<>();
        multiMultiBox.addItem(new Book("Introduction to Java"));
        multiMultiBox.addItem(new Pen("Blue"));

        System.out.println("Items in multiMultiBox:");
        for (Item item : multiMultiBox.getItems()) {
            item.display();
        }
    }
}
