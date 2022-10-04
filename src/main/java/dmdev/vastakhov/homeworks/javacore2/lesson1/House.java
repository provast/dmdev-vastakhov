package dmdev.vastakhov.homeworks.javacore2.lesson1;

public class House {
    private int houseNumber;
    private Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("Дом " + houseNumber + " содержит " + floors.length + " этажей");
    }
}
