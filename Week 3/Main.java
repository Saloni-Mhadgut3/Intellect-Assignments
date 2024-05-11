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
        }
    }

    public double getBalance(){
        return balance;
    }  

    public void calculateInterest(){
    }

    public void deductPenalty(){
    }
}

class SavingsAccount extends BankAccount{
    private static final double INTEREST = 0.03;
    public SavingsAccount(String accountNumber,String accountHolderName){
        super(accountNumber,accountHolderName);
        }
    
    @Override
    public void calculateInterest(){
        double interest = getBalance() * INTEREST;
        deposit(interest);
    }
 }

class CurrentAccount extends BankAccount
 {
     private static final double PENALTY = 10.0;
     public CurrentAccount(String accountNumber, String accountHolderName){
         super(accountNumber,accountHolderName);
     }
 
     public void deductPenalty()
     {
        withdraw(PENALTY);
     }
 }

public class Main{
    public static void main(String[] args){
        BankAccount currentAccount = new CurrentAccount("1234567890", "John Doe");
        currentAccount.deposit(1000);
        ((CurrentAccount) currentAccount).deductPenalty();  // PENALTY_AMOUNT = 10.0 (constant)
        System.out.println(currentAccount.getBalance()); // Expected output: 990.0
    }
}