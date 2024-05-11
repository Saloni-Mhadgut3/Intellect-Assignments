class BankAccount{
    private String accountNumber, accountHolderName;
    private double balance;

    public BankAccount(String accountNumber,String accountHolderName)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        balance +=amount;
    }

    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount;
        }}

    public double getBalance(){
        return balance;
    }  
}

class SavingsAccount extends BankAccount{
    private static final double INTEREST = 0.03;
    public SavingsAccount(String accountNumber,String accountHolderName){
        super(accountNumber,accountHolderName);
        }
    
    public void calculateInterest(){
        double interest = getBalance() * INTEREST;
        deposit(interest);
    }
 }

public class Main{
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount("1234567890", "Jane Smith");
        savingsAccount.deposit(1000);
        savingsAccount.calculateInterest();
        System.out.println(savingsAccount.getBalance()); // Expected output: 1030.0
    }
}
