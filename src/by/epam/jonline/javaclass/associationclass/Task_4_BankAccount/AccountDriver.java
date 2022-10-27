package by.epam.jonline.javaclass.associationclass.Task_4_BankAccount;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AccountDriver {

    /*
     *  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
     *  счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
     *  всем счетам, имеющим положительный и отрицательный балансы отдельно.
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Account[] account = new Account[5];
        int numAccounts = 0;

        int choice;

        do {
            choice = menu(keyboard);
            System.out.println();

            if (choice == 1) {
                account[numAccounts++] = createAccount(keyboard);
            } else if (choice == 2) {
                doDeposit(account, numAccounts, keyboard);
            } else if (choice == 3) {
                doWithdraw(account, numAccounts, keyboard);
            } else if (choice == 4) {
                setStatus(account, numAccounts, keyboard);
            } else if (choice == 5) {
                findAccountByNumber(account, numAccounts, keyboard);
            } else if (choice == 6) {
                sumAccountFunds(account, numAccounts);
            } else if (choice == 7) {
                sortByBalance(account, numAccounts);
            } else if (choice == 8) {
                sumPositiveNegativeBalance(account, numAccounts);
            } else {
                System.out.println("GoodBye!");
            }
            System.out.println();

        } while (choice != 9);
    }

    public static int accountMenu(Scanner keyboard) {
        System.out.println("Select Account Type: ");
        System.out.println("1. Checking account");

        int choice;

        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        } while (choice != 1);

        return choice;
    }

    public static int searchAccount(Account[] account, int count, int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (account[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }

    public static void sumPositiveNegativeBalance(Account[] account, int count) {
        double sumNegative = 0;
        double sumPositive = 0;
        for (int i = 0; i < count; i++) {
            if (account[i].getBalance() < 0) {
                sumNegative += account[i].getBalance();
            } else if (account[i].getBalance() > 0) {
                sumPositive += account[i].getBalance();
            }
        }
        System.out.println("Total accounts balance (negative): " + sumNegative);
        System.out.println("Total accounts balance (positive): " + sumPositive);
    }

    public static void sortByBalance(Account[] account, int count) {
        Account[] tempAccounts = account;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (tempAccounts[i].balance < tempAccounts[j].balance) {
                    Account temp = tempAccounts[j];
                    tempAccounts[j] = tempAccounts[i];
                    tempAccounts[i] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Account №: " + tempAccounts[i].getAccountNumber() + ", balance: " + tempAccounts[i].balance);
        }
    }

    public static void sumAccountFunds(Account[] account, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += account[i].balance;
        }
        System.out.println("Total accounts balance: " + sum);
    }

    public static void findAccountByNumber(Account[] account, int count, Scanner keyboard) {
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
        int index = searchAccount(account, count, accountNumber);
        if (index >= 0) {
            System.out.println("Account №: " + accountNumber + " balance: " + account[index].balance + " Status, blocked: " + account[index].isBlocked);
        } else {
            System.out.println("No account with № " + accountNumber);
        }
    }

    public static void setStatus(Account[] account, int count, Scanner keyboard) {
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
        int index = searchAccount(account, count, accountNumber);
        if (index >= 0) {
            System.out.println("Please enter 1 to block account or 2 to unblock: ");
            int select = keyboard.nextInt();
            if (select == 1) {
                account[index].setBlocked();
                System.out.println("Account №" + accountNumber + " is blocked");
            } else {
                account[index].setUnblocked();
                System.out.println("Account №" + accountNumber + " is unblocked");
            }
        }
    }


    public static void doDeposit(Account[] account, int count, Scanner keyboard) {
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
        int index = searchAccount(account, count, accountNumber);
        if (account[index].isBlocked) {
            System.out.println("Access denied, account blocked");
            return;
        }
        if (index >= 0) {
            System.out.print("Please enter deposit amount: ");
            double amount = keyboard.nextDouble();
            account[index].deposit(amount);
        } else {
            System.out.println("No account exist with account number: " + accountNumber);
        }
    }

    public static void doWithdraw(Account[] account, int count, Scanner keyboard) {

        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
        int index = searchAccount(account, count, accountNumber);
        if (account[index].isBlocked) {
            System.out.println("Access denied, account blocked");
            return;
        }
        if (index >= 0) {
            System.out.println("Please enter withdraw amount: ");
            double amount = keyboard.nextDouble();
            account[index].withdraw(amount);
        } else {
            System.out.println("No account exist with account number: " + accountNumber);
        }
    }


    public static Account createAccount(Scanner keyboard) {
        Account account = null;
        int choice = accountMenu(keyboard);
        int accountNumber;
        System.out.print("Enter Account Number: ");
        accountNumber = keyboard.nextInt();

        if (choice == 1) {
            account = new CheckingAccount(accountNumber);
        }
        return account;
    }

    public static int menu(Scanner keyboard) {
        System.out.println("Bank account menu");
        System.out.println("1. Create new account");
        System.out.println("2. Deposit funds");
        System.out.println("3. Withdraw funds");
        System.out.println("4. Set account status");
        System.out.println("5. Find account");
        System.out.println("6. Total balance");
        System.out.println("7. Show accounts sorted by balance value");
        System.out.println("8. Show positive/negative sums");
        System.out.println("9. Quit");

        int choice;

        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        } while (choice < 1 || choice > 9);

        return choice;
    }
}
