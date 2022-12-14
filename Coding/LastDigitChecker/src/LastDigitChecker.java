public class LastDigitChecker {
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        if(!(isValid(numberOne) && isValid(numberTwo) && isValid(numberThree))) return false;
        return (numberOne % 10 == numberTwo % 10 || numberTwo % 10 == numberThree % 10 || numberOne % 10 == numberThree % 10);
    }
}
