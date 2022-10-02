package dmdev.vastakhov.homeworks.javacore2.lesson1;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира " + flatNumber + " содержит " + rooms.length + " комнат");
    }
}
