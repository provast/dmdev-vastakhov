package dmdev.vastakhov.homeworks.javacore2.lesson5.universe;

public class Planet extends MovingCelestialBody implements Flyable{

    private boolean isGasPlanet;

    public Planet(String name, double radius, double speed, boolean isGasPlanet) {
        super(name, radius, speed);
        this.isGasPlanet = isGasPlanet;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "isGasPlanet=" + isGasPlanet +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void fly() {
        System.out.println("Я летаю вокруг Солнца");
    }
}
