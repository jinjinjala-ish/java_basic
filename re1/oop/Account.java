package re1.oop;

public class Account {
    int balance;

     public Account(int balance){
         this.balance = balance;
     }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance - amount > 0) {
            balance -= amount;
        } else {
            System.out.println("잔액부족");
        }
    }

    public void getBalance(){
        System.out.println(balance);
    }
}
