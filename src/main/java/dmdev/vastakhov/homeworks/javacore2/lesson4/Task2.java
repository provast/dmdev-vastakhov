package dmdev.vastakhov.homeworks.javacore2.lesson4;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {
    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println(calcSumArray(convertStringToIntArray(value)));
    }

    private static int[] convertStringToIntArray(String value) {
        String onlyDigits = value.replaceAll("[^0-9]", "");
        int[] digitArray = new int[onlyDigits.length()];
        for (int i = 0; i < digitArray.length; i++) {
            digitArray[i] = Integer.parseInt(String.valueOf(onlyDigits.charAt(i)));
        }
        return digitArray;
    }

    private static int calcSumArray(int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }
        return result;
    }
}
