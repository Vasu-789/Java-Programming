public class Main
{
    public static void main(String[] args)
    {
        Dimension dimensions = new Dimension(30, 30, 10);
        Case theCase = new Case("520B", "Asus", "960", dimensions);

        Monitor theMonitor = new Monitor("64inch Beast", "Samsung", 47,new Resolution(3840, 2160));

        Motherboard theMotherboard = new Motherboard("XTR-980", "Asus", 8, 8, "v3.56");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        //Challenge

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Vasu's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}