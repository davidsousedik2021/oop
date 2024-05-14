package boxes;

public class Pen implements Item  {
    private String color;

    public Pen(String color) {
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Pen Color: " + color);
    }
}
