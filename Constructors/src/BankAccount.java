public class BankAccount
{
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount()
    {
        this("56789", 25, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(String accountNumber, long balance, String customerName, String email, String phoneNumber)
    {
        System.out.println("Constructor With Parameters Called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance)
    {
        this.balance = balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(long amount)
    {
        balance += amount;
        System.out.println("Deposit Of " + amount + " Made. New Balance Is " + balance);
    }

    public void withdrawFunds(long amount)
    {
        if(balance - amount > 0)
        {
            balance = balance - amount;
            System.out.println("Withdrawal Of " + amount + " Made. New Balance Is " + balance);
        }
        else
        {
            System.out.println("Only " + balance + " Is Available, Withdrawal Of " + amount + " Was Not Successful Due To Insufficient Balance");
        }
    }
}
