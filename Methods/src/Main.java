public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score Was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your Final Score Was " + highScore);

        // Challenge

        displayHighScorePosition("Jack", calculateHighScorePosition(1500));
        displayHighScorePosition("Bucky", calculateHighScorePosition(900));
        displayHighScorePosition("Steve", calculateHighScorePosition(400));
        displayHighScorePosition("Robert", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " Managed To Get Into Position " + position + " On The High Score Table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        /*if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if(playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }*/

        int position = 4; // Assuming Position 4 Will Be Returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}