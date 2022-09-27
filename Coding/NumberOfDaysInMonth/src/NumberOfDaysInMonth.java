public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        return year % 4 == 0 ? ( year % 100 == 0 ? ( year % 400 == 0 ? true : false ) : true ) : false;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        if(month == 2 && isLeapYear(year)) {
            return 29;
        } else if(month == 2 && !isLeapYear(year)) {
            return 28;
        } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else {
            return 30;
        }
    }
}
