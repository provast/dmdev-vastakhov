package dmdev.vastakhov.homeworks.javacore1.lesson6;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив
 * с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования
 * написанного функционала.
 */

public class Task1 {
    public static void main(String[] args) {

        int[] all = {3, 5, -6, 3, 2, -9, 0, -123};
        System.out.println(Arrays.toString(multiplyArrayByLength(all)));

    }

    public static int calcPositiveNumbersCount(int[] array) {

        int positiveNumbersCounter = 0;
        for (int n : array) {
            if (n >= 0) positiveNumbersCounter++;
        }
        return positiveNumbersCounter;
    }

    public static int[] multiplyArrayByLength(int[] array) {

        int[] newArray = new int[calcPositiveNumbersCount(array)];
        int i = 0;
        for (int value : array) {
            if (value >= 0) {
                newArray[i] = value * calcPositiveNumbersCount(array);
                i++;
            }
        }
        return newArray;
    }
}