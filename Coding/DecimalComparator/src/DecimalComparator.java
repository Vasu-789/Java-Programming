public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myNumberOne, double myNumberTwo) {
        return (int) (myNumberOne * 1000) == (int) (myNumberTwo *1000);
    }
}
