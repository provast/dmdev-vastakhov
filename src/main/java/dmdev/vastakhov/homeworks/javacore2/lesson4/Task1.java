package dmdev.vastakhov.homeworks.javacore2.lesson4;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {
    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        System.out.println(deleteDuplicateAndSpaces(value));
    }

    private static String deleteDuplicateAndSpaces(String value) {
        String startValue = value.replaceAll(" ", "").toUpperCase();
        StringBuilder result = new StringBuilder().append(startValue.charAt(0));
        for (int i = 1; i < startValue.length(); i++) {
            if (startValue.charAt(i) != startValue.charAt(i - 1)) {
                result.append(startValue.charAt(i));
            }
        }
        return result.toString();
    }

}
