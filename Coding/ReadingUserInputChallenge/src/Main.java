import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter Number #" + (i + 1));
            if(input.hasNextInt()) {
                sum += input.nextInt();
            } else {
                System.out.println("Invalid Number");
                i--;
            }
            input.nextLine();
        }

        System.out.println("The Sum Of 10 Numbers Entered Is : " + sum);

        input.close();
    }
}