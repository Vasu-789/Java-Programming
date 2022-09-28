import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while(input.hasNextInt()) {
            sum += input.nextInt();
            count += 1;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));

        input.close();
    }
}
