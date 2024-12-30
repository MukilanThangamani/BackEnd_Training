package Additional;

public class BankingSystem {
    private String name;
    private int accNo;
    private double bal;
    public BankingSystem(String name, int accNo, int bal){
        this.name = name;
        this.accNo = accNo;
        this.bal = bal;
    }
    public void deposit(int amt){
        if(amt>=0){
            bal+=amt;
            System.out.println("After deposited:"+bal);
        }
    }
    public void withdraw(int amt){
        bal-=amt;
        System.out.println("After withdraw balance is:"+bal);
    }
    public void balance(){
        System.out.println("balance amt:"+bal);
    }
    public static void main(String[] args) {
      BankingSystem bs = new BankingSystem("Akil",123456,0);
      bs.deposit(1000);
      bs.balance();
      bs.withdraw(450);
      bs.balance();
    }
}
