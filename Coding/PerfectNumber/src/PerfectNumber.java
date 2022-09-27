public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if(num < 2) {
            return false;
        }

        int sum = 1;
        for(int i = 2; i * i <= num; i++)
        {
            if (num % i == 0) {

                if (i * i == num) {
                    sum += i;
                } else {
                    sum += i + (num / i);
                }
            }
        }
        return num == sum;
    }
}
