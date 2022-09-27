public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if(numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) return false;
        int temp = numberTwo;
        while(numberOne > 0) {
            while(numberTwo > 0) {
                if(numberOne % 10 == numberTwo % 10) return true;
                numberTwo /= 10;
            }
            numberTwo = temp;
            numberOne /= 10;
        }
        return false;
    }
}
