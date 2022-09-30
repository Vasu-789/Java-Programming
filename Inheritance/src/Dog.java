public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat)
    {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.coat = coat;
    }

    private void chew()
    {
        System.out.println("Dog.chew() Called");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat() Called");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dog.walk() Called");
        super.move(5);
    }

    public void run()
    {
        System.out.println("Dog.run() Called");
        move(10);
    }

    private void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() Called");
    }

    @Override
    public void move(int speed)
    {
        System.out.println("Dog.move() Called");
        moveLegs(speed);
        super.move(speed);
    }

    public int getEyes()
    {
        return eyes;
    }

    public int getLegs()
    {
        return legs;
    }

    public int getTails()
    {
        return tails;
    }

    public int getTeeth()
    {
        return teeth;
    }

    public String getCoat()
    {
        return coat;
    }
}
