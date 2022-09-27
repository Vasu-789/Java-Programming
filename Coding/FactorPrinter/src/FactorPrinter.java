public class FactorPrinter {
    public static void printFactors(int num) {
        if(num < 1) {
            System.out.println("Invalid Value");
        }

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
