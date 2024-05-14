package boxes;

public class Box<T extends Item> {
    private T item;

    public Box() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
