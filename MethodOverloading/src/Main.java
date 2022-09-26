public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Vasu", 500);
        System.out.println("New Score Is " + newScore);
        calculateScore(75);
        calculateScore();

        //Challenge

        calcFeetAndInchesToCentimeters(5, 10);
        calcFeetAndInchesToCentimeters(78);
        calcFeetAndInchesToCentimeters(-1, 10);
        calcFeetAndInchesToCentimeters(5, 13);
        calcFeetAndInchesToCentimeters(-10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player Scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player Name, No Player Score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid Parameters");
            return -1;
        }
        double centimeters = (((feet * 12) + inches) * 2.54);
        System.out.println(feet + " Feet ," + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            System.out.println("Invalid Parameters");
            return -1;
        }
        double feet = (int) inches / 12;
        double centimeters = (inches * 2.54);
        System.out.println(feet + " Feet ," + inches % 12 + " inches = " + centimeters + " cm");
        return centimeters;
    }
}