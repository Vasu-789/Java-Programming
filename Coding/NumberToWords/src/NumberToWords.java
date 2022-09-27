public class NumberToWords {
    public static void numberToWords(int number){
        int reverseNumber = reverse(number);
        int lastDigit = 0;
        int count = getDigitCount(number);
        int reverseCount = getDigitCount(reverse(number));
        if(number < 0){
            System.out.println("Invalid Value");
        }else if(number == 0) {
            System.out.println("Zero");
        }else{
            while(reverseNumber > 0){
                lastDigit = reverseNumber % 10;
                reverseNumber /= 10;

                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
            if(count > reverseCount){
                for(int i = 1; i <= count - reverseCount; i++ ){
                    System.out.println("Zero");
                }
            }

        }
    }

    public static int reverse(int number){
        int reverse = 0;
        int negativeFlag = 0;

        if(number < 0){
            number *= -1;
            negativeFlag++;
        }

        while(!(number <= 0)){
            reverse += number % 10;
            number /= 10;
            reverse *= 10;
        }
        reverse /= 10;

        if(negativeFlag != 0){
            reverse *= -1;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        int count = 0;

        if(number < 0){
            return -1;
        }

        if(number == 0){
            return 1;
        }

        while(!(number <= 0)){
            count++;
            number /= 10;
        }
        return count;
    }
}
