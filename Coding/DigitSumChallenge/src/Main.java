public class Main {
    public static void main(String[] args) {
        System.out.println("The Digit Sum Of "+ 158 +" is " + sumDigits(158));
        System.out.println("The Digit Sum Of "+ -158 +" is " + sumDigits(-158));
        System.out.println("The Digit Sum Of "+ 45678 +" is " + sumDigits(45678));
    }

    public static int sumDigits(int num) {
        if(num < 10) {
            return -1;
        }
        int sum = 0;
        while(num > 0) {
            sum += (num % 10);
            num = num / 10;
        }
        return sum;
    }
}