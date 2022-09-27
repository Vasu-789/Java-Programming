public class Main {
    public static void main(String[] args) {
        dayOfWeekSwitch(-1);
        dayOfWeekSwitch(0);
        dayOfWeekSwitch(1);
        dayOfWeekSwitch(2);
        dayOfWeekSwitch(3);
        dayOfWeekSwitch(4);
        dayOfWeekSwitch(5);
        dayOfWeekSwitch(6);
        dayOfWeekSwitch(7);
        dayOfWeekIf(-1);
        dayOfWeekIf(0);
        dayOfWeekIf(1);
        dayOfWeekIf(2);
        dayOfWeekIf(3);
        dayOfWeekIf(4);
        dayOfWeekIf(5);
        dayOfWeekIf(6);
        dayOfWeekIf(7);
    }

    public static void dayOfWeekSwitch(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    public static void dayOfWeekIf(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}