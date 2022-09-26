public class TeenNumberChecker {
    public static boolean hasTeen(int myNumberOne, int myNumberTwo, int myNumberThree) {
        return (isTeen(myNumberOne) || isTeen(myNumberTwo) || isTeen(myNumberThree));
    }

    public static boolean isTeen(int myNumberOne) {
        return (myNumberOne >= 13 && myNumberOne <= 19);
    }
}
