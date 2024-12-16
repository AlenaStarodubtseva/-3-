public class Account {
    // Закрытые поля, недоступные напрямую
    private String accountNumber;
    private double balance;

    // Конструктор для создания объекта Account
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Начальный баланс не может быть отрицательным. Установлено значение 0.");
            this.balance = 0;
        }
    }

    // Геттер для номера счета
    public String getAccountNumber() {
        return accountNumber;
    }

    // Геттер для баланса
    public double getBalance() {
        return balance;
    }

    // Метод для пополнения баланса
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Баланс пополнен на " + amount + ". Текущий баланс: " + balance);
        } else {
            System.out.println("Сумма пополнения должна быть больше нуля.");
        }
    }

    // Метод для снятия средств с баланса
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято " + amount + ". Текущий баланс: " + balance);
        } else if (amount > balance) {
            System.out.println("Недостаточно средств на счете.");
        } else {
            System.out.println("Сумма снятия должна быть больше нуля.");
        }
    }
}
