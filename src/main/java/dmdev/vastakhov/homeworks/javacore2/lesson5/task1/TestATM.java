package dmdev.vastakhov.homeworks.javacore2.lesson5.task1;

public class TestATM {

    public static void main(String[] args) {

        ATM atm = new ATM(2000, 1000, 500);
        System.out.println(atm.getTotalMoney());
        atm.withdrawal(3570);
        System.out.println(atm.getTotalMoney());

    }

}
