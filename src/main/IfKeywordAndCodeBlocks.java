package main;

public class IfKeywordAndCodeBlocks {

    //The if statement identifies which statement or code block to run based on the value of an expression, so based on a condition
    //We can use the else statement after the if. In this case when the condition is false, then else block will execute

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //if we only have one line to execute for an if statement, we can remove the body like below
        if (score == 5000)
            System.out.println("you score was 5000");

        if (score < 5000) {
            System.out.println("score less than 5000");
        } else {
            System.out.println("score is more than 5000 or equal");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score = " + finalScore);
        }

        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score = " + finalScore);
        }

        calculateScore(true, 800, 6, 100);//arguments given


        displayHighScorePosition("Player 1", calculateHighScorePosition(1500));
        displayHighScorePosition("Player 3", calculateHighScorePosition(900));
        displayHighScorePosition("Player 4", calculateHighScorePosition(400));
        displayHighScorePosition("Player 2", calculateHighScorePosition(50));

    }

    //a void method can also be known as a procedure
    //a method, generally speaking, can also be known as a function

    //  /Access modifier
    // /      /No need for initialization
    ///      /      /Return type
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {// parameters expected
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore);
            return finalScore;
        }

        return -1;//-1 usually indicates an error
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.printf("Player %s managed to get into position %d on the highscore table%n", playerName, position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;
    }

}
