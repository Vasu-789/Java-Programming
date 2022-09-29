public class Main
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();
        account.setBalance(1500);
        account.depositFunds(500);
        System.out.println(account.getBalance());
        account.withdrawFunds(5000);
        System.out.println(account.getBalance());
        account.withdrawFunds(1500);
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());

        BankAccount bobsAccount = new BankAccount("12345", 0, "Bob Brown", "myemail@bob.com", "9999999999");
        System.out.println(bobsAccount.getCustomerName());

        //Challenge

        System.out.println("Challenge");
        VipCustomer king = new VipCustomer();
        VipCustomer ram = new VipCustomer("Ram", 500000);
        VipCustomer sid = new VipCustomer("Sid", 550000, "sid@gmail.com");
        System.out.println(king.getName()+", "+king.getCreditLimit()+", "+king.getEmailAddress());
        System.out.println(ram.getName()+", "+ram.getCreditLimit()+", "+ram.getEmailAddress());
        System.out.println(sid.getName()+", "+sid.getCreditLimit()+", "+sid.getEmailAddress());
    }
}