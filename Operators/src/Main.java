public class Main {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("PreviousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("PreviousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // The Remainder Of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // If Statement

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It Is Not An Alien!");
            System.out.println("And I Am Scared Of Aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You Got The High Score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater Than Second Top Score And Less Than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either Or Both Of The Conditions Are True");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This Is True");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This Is Not Supposed To Happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar Is True");
        }

        //Operator Challenge

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myFinalDouble = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println("MyFinalDouble = " + myFinalDouble);
        double myDoubleRemainder = myFinalDouble % 40.00d;
        System.out.println("MyDoubleRemainder = " + myDoubleRemainder);
        boolean myBooleanValue = (myDoubleRemainder == 0) ? true : false;
        System.out.println("myBooleanValue Is " + myBooleanValue);
        if(!myBooleanValue){
            System.out.println("Got Some Remainder");
        }
    }
}