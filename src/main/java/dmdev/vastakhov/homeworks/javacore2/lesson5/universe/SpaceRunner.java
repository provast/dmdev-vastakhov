package dmdev.vastakhov.homeworks.javacore2.lesson5.universe;

public class SpaceRunner {
    public static void main(String[] args) {
        Star sun = new Star("Солнце", 696340);
        Planet earth = new Planet("Земля", 6371, 107000, false);
        Satellite moon = new Satellite("Луна", 1737, 1, 384400, earth);
        Comet halleyComet = new Comet("Комета Галлея", 5.5, 70, 1986);

        CelestialBody[] array = new CelestialBody[]{sun, earth, moon, halleyComet};
        Flyable[] array2 = new Flyable[]{earth, moon, halleyComet};

        for (CelestialBody body : array) {
            System.out.println(body);
        }

        for (Flyable body : array2) {
            body.fly();
        }
    }
}
