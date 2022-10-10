package dmdev.vastakhov.homeworks.javacore2.lesson5.universe;

public class Star extends CelestialBody{
    public Star(String name, double radius) {
        super(name, radius);
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
