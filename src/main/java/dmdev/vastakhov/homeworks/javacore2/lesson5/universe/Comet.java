package dmdev.vastakhov.homeworks.javacore2.lesson5.universe;

public class Comet extends MovingCelestialBody implements Flyable{

    private int openingYear;

    public Comet(String name, double radius, double speed, int openingYear) {
        super(name, radius, speed);
        this.openingYear = openingYear;
    }

    @Override
    public String toString() {
        return "Comet{" +
                "openingYear=" + openingYear +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Я лечу в бесконечность...");
    }
}
