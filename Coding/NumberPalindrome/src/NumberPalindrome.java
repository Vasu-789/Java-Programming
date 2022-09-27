public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        if(num / 10 <=0) {
            return true;
        }
        int temp = num;
        int reverse = 0;
        while(num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return temp == reverse;
    }
}
