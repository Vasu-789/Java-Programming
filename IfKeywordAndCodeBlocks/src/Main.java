public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000){
            System.out.println("Your Score Was Less Than 5000 But Greater Than 1000");
        } else if(score < 1000) {
            System.out.println("Your Score Was Less Than 1000");
        } else {
            System.out.println("Got Here");
        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score Was " + finalScore);
        }

        //Challenge

        score = 10000;
        levelCompleted  = 8;
        bonus = 200;
        if(gameOver){
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Your Second Final Score Was " + secondFinalScore);
        }
    }
}