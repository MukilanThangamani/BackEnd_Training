package OOPS;

public class BankAccount {
    private int accountNumber;
    private int balance;
    int deposit;
    int withdraw;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int dep){
        this.deposit = dep;
    }
    public void withdraw(int withdraw){
        this.withdraw = withdraw;
    }
    public void checkBalance(){
         balance = deposit-withdraw;
        System.out.println("Ac no:"+accountNumber);
        System.out.println("Deposit amt:"+deposit);
        System.out.println("Withdraw amt:"+withdraw);
        System.out.println("Balance:"+balance);
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setAccountNumber(1234567890);
        obj.deposit(1000);
        obj.withdraw(500);
        obj.checkBalance();
    }
}
