public class Main {
    public static void main(String[] args) {
        int balanceClient = 100;
        int depositMoney = 2500;
        int every100Rubles = depositMoney / 100;
        int finalBalance;

        if (depositMoney > 1000) {
            finalBalance = depositMoney + every100Rubles + balanceClient;
            every100Rubles = depositMoney / 100;
        } else {
            finalBalance = depositMoney + balanceClient;
            every100Rubles = 0;
        }
        System.out.println("Итоговый баланс: " + finalBalance + " рублей.");
        System.out.println("Бонусных рублей на счету: " + every100Rubles + " рублей.");

    }
}
