package boxes;

import java.util.ArrayList;
import java.util.List;

public class MultiBox <T extends Item> {

    private List<T> items;

    public MultiBox() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
