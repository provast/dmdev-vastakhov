package dmdev.vastakhov.homeworks.javacore2.lesson5.universe;

public abstract class CelestialBody {

    protected String name;
    protected double radius;

    public CelestialBody(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
}
