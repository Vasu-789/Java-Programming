public class Main {
    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count Value Is " + count);
            count++;
        }

        for(int i = 6; i != 6; i++)
        {
            System.out.println("Count Value Is " + i);
        }

        count = 5;
        do {
            System.out.println("Count Value Is " + count);
            count++;
        } while(count != 6);

        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even Number " + number);
        }

        //Challenge

        System.out.println("Challange");
        int evenNumbers = 0;
        number = 4;
        finishNumber = 25;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumbers++;
            System.out.println("Even Number " + number);
            if(evenNumbers == 5) {
                System.out.println("5 Even Number's Found Exiting");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    }
}