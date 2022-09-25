package dmdev.vastakhov.homeworks.javacore1.lesson4;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class Task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        calc(operand1, operand2, operation);
    }

    private static void calc(double o1, double o2, char operation) {
        switch (operation) {
            case '+':
                System.out.println("Результат: " + (o1 + o2));
                break;
            case '-':
                System.out.println("Результат: " + (o1 - o2));
                break;
            case '*':
                System.out.println("Результат: " + (o1 * o2));
                break;
            case '/':
                System.out.println("Результат: " + (o1 / o2));
                break;
            case '%':
                System.out.println("Результат: " + (o1 % o2));
                break;
            default:
                System.out.println("Введена некоректная операция");
                break;
        }
    }
}
