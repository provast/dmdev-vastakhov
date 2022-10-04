package dmdev.vastakhov.homeworks.javacore1.lesson6;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */

public class Task2 {
    public static void main(String[] args) {

        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        printAllValuesGreaterThanAverage(array);
    }

    public static int[] parsCharArray(char[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static double calcArrayAverageValue(int[] array) {
        double result = 0;
        for (int value : array) {
            result += value;
        }
        return result / array.length;
    }

    public static void printAllValuesGreaterThanAverage(char[] charArray) {
        int[] array = parsCharArray(charArray);
        double averageValue = calcArrayAverageValue(array);
        System.out.println("average: " + averageValue);
        for (int value : array) {
            if (value > averageValue) {
                System.out.print(value + " ");
            }
        }

    }
}
