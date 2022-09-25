package dmdev.vastakhov.homeworks.javacore1.lesson5;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Task3 {

    public static void main(String[] args) {
        double salary = 600;
        double currentBalance = 0;
        double brokerCurrentBalance = 0;
        for (int i = 1; i <= 3 * 12 + 2; i++) {
            if (i % 6 == 0) {
                salary += 400;
            }
            currentBalance = calcCurrentBalance(salary, currentBalance);
            brokerCurrentBalance = calcBrokerCurrentBalance(salary, brokerCurrentBalance);
            System.out.println("За " + i + " месяц Ваня получил " + salary);
            System.out.println("Текущий баланс Вани: " + currentBalance);
            System.out.println("Текущий баланс брокерского счета: " + brokerCurrentBalance);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

    private static double calcBrokerCurrentBalance(double salary, double brokerCurrentBalance) {
        double investmentPercent = 0.02;
        brokerCurrentBalance += salary * 0.1;
        brokerCurrentBalance += brokerCurrentBalance * investmentPercent;
        return brokerCurrentBalance;
    }

    private static double calcCurrentBalance(double salary, double currentBalance) {
        currentBalance += salary - 300 - (salary * 0.1);
        return currentBalance;
    }
}
