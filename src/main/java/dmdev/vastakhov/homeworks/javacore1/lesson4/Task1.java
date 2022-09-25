package dmdev.vastakhov.homeworks.javacore1.lesson4;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {
        int minutes = 1;
        printQuarter(minutes);
    }

    private static void printQuarter(int minutes) {
        if (minutes >= 0 && minutes < 15) {
            System.out.println("Первая четверть");
        }
        if (minutes >= 15 && minutes < 30) {
            System.out.println("Вторая четверть");
        }
        if (minutes >= 30 && minutes < 45) {
            System.out.println("Третья четверть");
        }
        if (minutes >= 45 && minutes < 60) {
            System.out.println("Четвертая четверть");
        }
        if (minutes < 0 || minutes > 59) {
            System.out.println("Введеное значение выходит за пределы диапазона");
        }
    }
}
