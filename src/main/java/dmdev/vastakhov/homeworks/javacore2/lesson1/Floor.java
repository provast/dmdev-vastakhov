package dmdev.vastakhov.homeworks.javacore2.lesson1;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print() {
        System.out.println("Этаж " + floorNumber + " содержит " + flats.length + " квартир");
    }
}
