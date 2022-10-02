package dmdev.vastakhov.homeworks.javacore2.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Flat firstFlat = new Flat(1, new Room[]{new Room(true), new Room(true), new Room(false)});
        Flat secondFlat = new Flat(2, new Room[]{new Room(true), new Room(false), new Room(false)});
        Flat thirdFlat = new Flat(3, new Room[]{new Room(true), new Room(true), new Room(false)});
        Flat fourthFlat = new Flat(4, new Room[]{new Room(true), new Room(false), new Room(false)});
        Floor firstFloor = new Floor(1, new Flat[]{firstFlat, secondFlat});
        Floor secondFloor = new Floor(2, new Flat[]{thirdFlat, fourthFlat});
        House firstHouse = new House(1, new Floor[]{firstFloor, secondFloor});
        printAllInformation(firstHouse);
    }

    private static void printAllInformation(House firstHouse) {
        firstHouse.print();
        for (Floor flor : firstHouse.getFloors()) {
            flor.print();
            for (Flat flat : flor.getFlats()) {
                flat.print();
                for (Room room : flat.getRooms()) {
                    room.print();
                }
            }
        }
    }
}
