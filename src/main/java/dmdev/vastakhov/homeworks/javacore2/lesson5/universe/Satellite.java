package dmdev.vastakhov.homeworks.javacore2.lesson5.universe;

public class Satellite extends MovingCelestialBody implements Flyable{

    private double distanceToThePlanet;
    private Planet planet;

    public Satellite(String name, double radius, double speed, double distanceToThePlanet, Planet planet) {
        super(name, radius, speed);
        this.distanceToThePlanet = distanceToThePlanet;
        this.planet = planet;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "distanceToThePlanet=" + distanceToThePlanet +
                ", planet=" + planet +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Я летаю вокруг планеты " + planet.getName());
    }
}
