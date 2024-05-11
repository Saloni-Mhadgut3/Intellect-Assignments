class BankAccount{
    private String Account_number, Account_holder;
    private double balance = 0.0;

    void deposit(double amount){
        balance +=amount;
    }

    void withdraw(double amount){
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

    public BankAccount(String Account_number,String Account_holder)
    {
        this.Account_number = Account_number;
        this.Account_holder = Account_holder;
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