package by.epam.jonline.javaclass.associationclass.Task_4_BankAccount;

public abstract class Account {

    /*
     *  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
     *  счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
     *  всем счетам, имеющим положительный и отрицательный балансы отдельно.
     */

    private int accountNumber;
    protected double balance;
    protected boolean isBlocked;

    Account () {
    }

    Account (int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.isBlocked = false;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBlocked () {
        this.isBlocked = true;
    }
    public void setUnblocked () {
        this.isBlocked = false;
    }
    public int getAccountNumber () {
        return this.accountNumber;
    }
    public abstract void deposit (double amount);
    public abstract void withdraw (double amount);


}
