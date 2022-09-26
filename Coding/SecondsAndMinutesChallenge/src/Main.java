public class Main {
    public static void main(String[] args) {
        getDurationString(65, 45);
        getDurationString(128);
        getDurationString(-128,59);
        getDurationString(-28);
    }

    public static void getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid Value");
            return;
        }

        int hours = (int) seconds / 3600 + (int) minutes / 60;
        String hourString = (hours < 10) ? "0" : "";
        String minutesString = (minutes % 60 < 10) ? "0" : "";
        String secondsString = (seconds % 60 < 10) ? "0" : "";
        System.out.println(hourString + "" + hours + "h " + minutesString + "" + minutes % 60 + "m " + secondsString + "" + seconds % 60 + "s");
    }

    public static void getDurationString(int seconds) {
        getDurationString((int) seconds / 60, seconds % 60);
    }
}