public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking) {
            return false;
        } else if(hourOfDay >= 0 && hourOfDay <=23) {
            return (hourOfDay < 8 || hourOfDay > 22);
        } else {
            return false;
        }
    }
}
