public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int bigNum = Math.max(first, second);
        int max = -1;
        for(int i = 1; i < bigNum; i++) {
            if(first % i == 0 && second % i == 0) {
                max = Math.max(max, i);
            }
        }
        return max;
    }
}
