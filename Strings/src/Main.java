public class Main {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This Is A String";
        System.out.println("MyString Is Equal To " + myString);
        myString = myString + ", And This Is More.";
        System.out.println("MyString Is Equal To " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("MyString Is Equal To " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString =lastString + myInt;
        System.out.println("LastString Is Equal To " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString Is Equal To " + lastString);
    }
}