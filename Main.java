public class Main {
    public static void main(String[] args) {
        // Создаем объект Account
        Account myAccount = new Account("123456789", 1000);

        // Вывод начального состояния счета
        System.out.println("Номер счета: " + myAccount.getAccountNumber());
        System.out.println("Текущий баланс: " + myAccount.getBalance());

        // Пополняем баланс
        myAccount.deposit(500);

        // Пытаемся снять сумму больше текущего баланса
        myAccount.withdraw(2000);

        // Снимаем допустимую сумму
        myAccount.withdraw(300);

        // Проверяем состояние счета
        System.out.println("Оставшийся баланс: " + myAccount.getBalance());
    }
}
