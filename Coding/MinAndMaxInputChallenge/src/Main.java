import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        while(true) {
            System.out.println("Enter Number:");
            if(input.hasNextInt()) {
                int temp = input.nextInt();
                if(temp < minValue) {
                    minValue = temp;
                }
                if(temp > maxValue) {
                    maxValue = temp;
                }
            } else {
                break;
            }
        }
        System.out.println("The Min Value Entered Is : " + minValue + ", And Max Value Entered Is : " + maxValue);

        input.close();
    }
}