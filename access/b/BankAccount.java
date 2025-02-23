package access.b;

public class BankAccount {
    private int balance;

    public BankAccount(){
        this.balance = 0;
    }

    // public method: deposit
    public void deposit(int amount){
        if(isAmountValid(amount)) {
            balance += amount;
        } else{
            System.out.println("유효하지 않음");
        }
    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else{
            System.out.println("유효하지 않음");

        }
    }

    public int getBalance(){
        return balance;
    }

    //검증
    private boolean isAmountValid(int amount){
        //금액이 0보다 커야 함
        return amount > 0;
    }
}
