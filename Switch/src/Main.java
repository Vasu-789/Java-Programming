public class Main {
    public static void main(String[] args) {
        /*int value = 1;
        if(value == 1) {
            System.out.println("Value Was 1");
        } else if(value == 2) {
            System.out.println("Value Was 2");
        } else {
            System.out.println("Was Not 1 Or 2");
        }*/

        int switchValue = 10;

        switch(switchValue) {
            case 1:
                System.out.println("Value Was 1");
                break;
            case 2:
                System.out.println("Value Was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was A 3, Or A 4, Or A 5");
                System.out.println("Actually It Was A " + switchValue);
                break;
            default:
                System.out.println("Was Not 1, 2, 3, 4 Or 5");
        }

        //Challenge

        char myCharValue = 'V';

        switch(myCharValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Character " + myCharValue + " Is Found");
                break;
            default:
                System.out.println("Not Found A, B, C, D, Or E, But Found " + myCharValue);
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
        }
    }
}