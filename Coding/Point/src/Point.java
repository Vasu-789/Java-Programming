public class Point
{
    private int x;
    private int y;

    public Point()
    {

    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double distance()
    {
        return Math.sqrt(((x * -1) * (x * -1)) + ((y * -1) * (y * -1)));
    }

    public double distance(Point Obj)
    {
        return Math.sqrt(((Obj.x - this.x) * (Obj.x - this.x)) + (Obj.y - this.y) * (Obj.y - this.y));
    }

    public double distance(int x, int y)
    {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
}
