package Homework.Lesson5;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta (double summaPopolneniya) {           // Метод для пополнения счёта
        balance += summaPopolneniya;
        return balance;
    }

    double snyatieSoScheta (double summaSnyatiya) {               // Метод для снятия средств со счёта
        balance -= summaSnyatiya;
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 12.35;

        BankAccount YourAccount = new BankAccount();
        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        BankAccount HisAccount = new BankAccount();
        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        System.out.println("Баланс счёта пользователя " + MyAccount.name + " равен: " + MyAccount.balance);                   // Баланс до изменения
        System.out.println("Баланс счёта пользователя " + YourAccount.name + " равен: " + YourAccount.balance);               // Баланс до изменения
        System.out.println("Баланс счёта пользователя " + HisAccount.name + " равен: " + HisAccount.balance);                 // Баланс до изменения

        MyAccount.popolnenieScheta(90.54);        // Пополняем счёт на 90.54
        YourAccount.popolnenieScheta(104.0);      // Пополняем счёт на 104.0
        HisAccount.snyatieSoScheta(19.7);           // Снимаем со счёта 19.7

        System.out.println();

        System.out.println("Обновлённый баланс счёта пользователя " + MyAccount.name + " равен: " + MyAccount.balance);       // Баланс после изменения
        System.out.println("Обновлённый баланс счёта пользователя " + YourAccount.name + " равен: " + YourAccount.balance);   // Баланс после изменения
        System.out.println("Обновлённый баланс счёта пользователя " + HisAccount.name + " равен: " + HisAccount.balance);     // Баланс после изменения
    }
}