package access;

import access.b.BankAccount;

public class BankAmountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(10000);
        ba.withdraw(3000);
        System.out.println("balance = " + ba.getBalance());
    }
}
