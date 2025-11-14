
import java.util.*;

class Account {
    String customerName;
    int accNumber;
    String accType;
    double balance;

    Account(String name, int number, String type, double bal) {
        customerName = name;
        accNumber = number;
        accType = type;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Account Holder: " + customerName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: " + accType);
        System.out.println("Current Balance: " + balance);
    }
}

class SavAct extends Account {
    double interestRate = 0.05;

    SavAct(String name, int number, double bal) {
        super(name, number, "Savings", bal);
    }

    void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

class CurAct extends Account {
    double minBalance = 1000;
    double serviceCharge = 100;

    CurAct(String name, int number, double bal) {
        super(name, number, "Current", bal);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            checkMinimumBalance();
        }
    }

    void checkMinimumBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum!");
            System.out.println("Service charge imposed: " + serviceCharge);
        }
    }
}

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = sc.nextLine();

        System.out.println("Enter account number:");
        int accNo = sc.nextInt();

        System.out.println("Enter initial balance:");
        double bal = sc.nextDouble();

        System.out.print("Enter account type (Savings / Current): ");
        String type = sc.next();

        if (type.equalsIgnoreCase("Savings")) {

            SavAct s = new SavAct(name, accNo, bal);
            s.deposit(2000);
            s.computeAndDepositInterest();
            s.withdraw(1000);
            s.displayBalance();

        } else if (type.equalsIgnoreCase("Current")) {

            CurAct c = new CurAct(name, accNo, bal);
            c.deposit(3000);
            c.withdraw(3500);
            c.displayBalance();

        } else {
            System.out.println("Invalid account type!");
        }

        sc.close();
    }
}