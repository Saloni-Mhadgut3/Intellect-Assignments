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

    
}

public class Main{
    public static void main(String[] args){
        BankAccount account = new BankAccount("1234567890", "John Doe");
      
        account.deposit(1000);
        account.withdraw(500); 

        System.out.println(account.getBalance());
        // Expected output: 500.0

        System.out.println("Insufficient funds"); 
        // If incase of excess withdrawal


    }
}
