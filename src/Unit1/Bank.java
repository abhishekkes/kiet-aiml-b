package Unit1;

public class Bank {
    private int balance=10000;
    public void withdrawal(int amount)
    {
        if(amount>balance)
        {
            throw new InsufficientBalanceException("Cannot withdraw amount greater than Balance");
        }
        else
        {
            balance=balance-amount;
            System.out.println("Withdrawl Successfull, Remaining Balance "+balance);
        }
    }
}
