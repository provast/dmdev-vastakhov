package dmdev.vastakhov.homeworks.javacore2.lesson5.universe;

public abstract class MovingCelestialBody extends CelestialBody {

    protected double speed;

    public MovingCelestialBody(String name, double radius, double speed) {
        super(name, radius);
        this.speed = speed;
    }
}
