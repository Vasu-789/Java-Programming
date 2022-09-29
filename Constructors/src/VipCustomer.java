public class VipCustomer
{
    private String name;
    private long creditLimit;
    private String emailAddress;

    public VipCustomer()
    {
        this("Default Name", 10000, "default@email.com");

    }

    public VipCustomer(String name, long creditLimit)
    {
        this(name, creditLimit, "default@email.com");
    }

    public VipCustomer(String name, long creditLimit, String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
