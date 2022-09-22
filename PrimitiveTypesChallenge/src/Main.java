public class Main {
    public static void main(String[] args) {
        byte myByteValue = 120;
        short myShortValue = 1200;
        int myIntValue = 12000;
        long myLongTotal = 50000 + 10 * ( myByteValue + myShortValue + myIntValue );
        System.out.println("My Long Total Value " + myLongTotal);
    }
}