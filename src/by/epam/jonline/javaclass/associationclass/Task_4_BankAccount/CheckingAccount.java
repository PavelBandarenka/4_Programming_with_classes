package by.epam.jonline.javaclass.associationclass.Task_4_BankAccount;

public class CheckingAccount extends Account {

    /*
     *  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
     *  счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
     *  всем счетам, имеющим положительный и отрицательный балансы отдельно.
     */

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.printf("Amount deposited %.2f  %n", amount);
            System.out.printf("Current balance is: %.2f%n", balance);
        } else {
            System.out.println("Cannot deposit negative value");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0) {
            if (amount <= balance) {
                System.out.printf("Amount of %.2f withdrawn from account%n", amount);
                balance -= amount;
                System.out.printf("Current balance is: %.2f%n", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}
