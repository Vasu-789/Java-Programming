public class Main
{
    public static void main(String[] args)
    {
        GTR gtr = new GTR(36);
        gtr.steer(90);
        gtr.accelerate(30);
        gtr.accelerate(20);
        gtr.accelerate(-42);
    }
}