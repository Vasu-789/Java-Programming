public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 At 2% Interest = " + calculateInterest(10000, 2));

        for(int i = 0; i < 10; i++) {
            System.out.println("Loop " + i + " Hello!");
        }

        //Challenge 1

        System.out.println("Challenge 1");
        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 At " + i + "% Interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        //Challenge 2

        System.out.println("Challenge 2");
        for(int i = 8; i > 1; i--) {
            System.out.println("10,000 At " + i + "% Interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        //Challenge

        System.out.println("Challenge 3");
        int count = 0;
        for(int i = 0; i < 10; i++) {
            if(isPrime(i)) {
                System.out.println(i + " Is A Prime Number");
                count++;
                if(count == 3) {
                    System.out.println("Exiting For Loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <=(long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}