package dmdev.vastakhov.homeworks.javacore2.lesson5.task1;

/**
 * Задание 1
 * <p>
 * Создать класс, описывающий банкомат.
 * <p>
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * <p>
 * Сделать методы для добавления денег в банкомат.
 * <p>
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * <p>
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * <p>
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class ATM {

    private final int BANKNOTE_DENOMINATION_20 = 20;
    private final int BANKNOTE_DENOMINATION_50 = 50;
    private final int BANKNOTE_DENOMINATION_100 = 100;

    private int numberOfBanknotes_20;
    private int numberOfBanknotes_50;
    private int numberOfBanknotes_100;

    public ATM(int numberOfBanknotes_20, int numberOfBanknotes_50, int numberOfBanknotes_100) {
        this.numberOfBanknotes_20 = numberOfBanknotes_20;
        this.numberOfBanknotes_50 = numberOfBanknotes_50;
        this.numberOfBanknotes_100 = numberOfBanknotes_100;
    }

    public int getTotalMoney() {
        return numberOfBanknotes_20 * BANKNOTE_DENOMINATION_20 + numberOfBanknotes_50 * BANKNOTE_DENOMINATION_50 + numberOfBanknotes_100 * BANKNOTE_DENOMINATION_100;
    }

    public void addNumberOfBanknotes_20(int numberOfBanknotes_20) {
        if (numberOfBanknotes_20 > 0) {
            this.numberOfBanknotes_20 += numberOfBanknotes_20;
        }
    }

    public void addNumberOfBanknotes_50(int numberOfBanknotes_50) {
        if (numberOfBanknotes_50 > 0) {
            this.numberOfBanknotes_50 += numberOfBanknotes_50;
        }
    }

    public void addNumberOfBanknotes_100(int numberOfBanknotes_100) {
        if (numberOfBanknotes_100 > 0) {
            this.numberOfBanknotes_100 += numberOfBanknotes_100;
        }
    }

    public boolean withdrawal(int value) {
        if (value > getTotalMoney() || value < BANKNOTE_DENOMINATION_20) {
            return false;
        } else {
            if (value >= BANKNOTE_DENOMINATION_100 && value / BANKNOTE_DENOMINATION_100 >= numberOfBanknotes_100) {
                value = changeTotalMoney(value, BANKNOTE_DENOMINATION_100);
            }
            if (value >= BANKNOTE_DENOMINATION_50 && value / BANKNOTE_DENOMINATION_50 >= numberOfBanknotes_50) {
                value = changeTotalMoney(value, BANKNOTE_DENOMINATION_50);
            }
            if (value >= BANKNOTE_DENOMINATION_20 && value / BANKNOTE_DENOMINATION_20 >= numberOfBanknotes_20) {
                changeTotalMoney(value, BANKNOTE_DENOMINATION_20);
            }
            return true;
        }
    }

    private int changeTotalMoney(int withdrawalValue, int typeOfBanknotes) {
        int banknotesCount = withdrawalValue / typeOfBanknotes;
        withdrawalValue %= typeOfBanknotes;
        System.out.println("Выдано " + banknotesCount + " купюр наминалом " + typeOfBanknotes);
        switch (typeOfBanknotes) {
            case BANKNOTE_DENOMINATION_20:
                this.numberOfBanknotes_20 -= banknotesCount;
                break;
            case BANKNOTE_DENOMINATION_50:
                this.numberOfBanknotes_50 -= banknotesCount;
                break;
            case BANKNOTE_DENOMINATION_100:
                this.numberOfBanknotes_100 -= banknotesCount;
                break;
        }
        return withdrawalValue;
    }
}
