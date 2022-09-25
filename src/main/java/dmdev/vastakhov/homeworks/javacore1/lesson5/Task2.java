package dmdev.vastakhov.homeworks.javacore1.lesson5;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Task2 {
    public static void main(String[] args) {
        int value = 1234567;
        System.out.println("Если перевирнуть число " + value + " то получим " + flip(value));
    }

    private static int flip(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result *= 10;
            result += (currentValue % 10);
            currentValue /= 10;
        }

        return result;
    }
}
