package dmdev.vastakhov.homeworks.javacore2.lesson1;

public class Room {
    private boolean isThrough;

    public Room(boolean isThrough) {
        this.isThrough = isThrough;
    }

    public void print() {
        if (isThrough) {
            System.out.println("Комната проходная");
        } else System.out.println("Комната не проходная");
    }
}
