package Models;

import java.util.Scanner;

/***RockPaperScissors Game Logic Implementations***/
public class GameInProgress {
    String gameStage, player1, player2, player1_score, player2_score, gameProgression, playerOfChoice, objectOfChoice1, objectOfChoice2;

    public void ShowGaveStage() {
        System.out.println(" ");
        System.out.println("*** WELCOME TO REAKTOR PRE-ASSIGNMENT GAME DEVELOPMENT CHALLENGE 2022 ***");
        System.out.println(" ");
        System.out.println("To Play Game Select Enter : 1");
        System.out.println("To record Player 1 Historical Enter : 2");
        System.out.println("To record Player 2 Historical Enter : 3");

        Scanner consoleInput = new Scanner(System.in);
        int gameStageSelection = consoleInput.nextInt();
        if (gameStageSelection == 1) {

            System.out.println("--");
            System.out.println(" ");
            gameStage = consoleInput.nextLine();
            System.out.println("*** Enter Game Stage : First Attempt , Second Attempt or Third Attempt ***");
            System.out.println(" ");
            gameStage = consoleInput.nextLine();
            System.out.println("--");
            System.out.println("*** Welcome To Rock-Paper-Scissors: " + gameStage + " Stage ***");
            System.out.println(" ");

            System.out.println("*** Enter Player of choice : Player1 or Player2 *** ");
            System.out.println(" ");
            playerOfChoice = consoleInput.nextLine();
            System.out.println("--");
            System.out.println("***  Chosen Player of Choice Is : " + playerOfChoice + ""+"***");
            System.out.println(" ");

            System.out.println("*** GAME HAS STARTED ***");

            System.out.println(" ");
            System.out.println("*** Enter your choice 1 attempt : scissors , rock or paper ***");
            objectOfChoice1 = consoleInput.nextLine();
            System.out.println("--");
            System.out.println("*** Enter player2's choice  attempt : scissors , rock or paper ***");
            objectOfChoice2 = consoleInput.nextLine();
            System.out.println("--");
            if (objectOfChoice1 == "scissors" && objectOfChoice2 == " rock") {
                System.out.println("Congratulations" + playerOfChoice + " You Win");
            } else if (objectOfChoice1 == "rock" && objectOfChoice2 == "scissors") {
                System.out.println("Congratulations" + playerOfChoice + " You Win");
            } else if (objectOfChoice1 == "scissors" && objectOfChoice2 == "paper") {
                System.out.println("Congratulations" + playerOfChoice + " You Win");
            } else {
                System.out.println("*** Sorry ! You loose ***");
                System.out.println("*************************************");
            }

        } else if (gameStageSelection == 2) {
            System.out.println(" ");
            System.out.println("To record Player 1 Historical Enter : 2");
            System.out.println(" ");
            Player1_HistoricalRecords player1_historicalRecords = new Player1_HistoricalRecords();
            player1_historicalRecords.ShowPlayerName();
            player1_historicalRecords.ShowMatchesPlayed();
            player1_historicalRecords.ShowNoOfWins();
            player1_historicalRecords.ShowNoOfLoss();
            player1_historicalRecords.ShowWinRatio();
            player1_historicalRecords.MostPlayedHands();
        } else if (gameStageSelection == 3) {
            System.out.println("To record Player 2 Historical Enter : 3");

            Player2_HistoricalRecords player2_historicalRecords = new Player2_HistoricalRecords();
            player2_historicalRecords.ShowPlayerName();
            player2_historicalRecords.ShowMatchesPlayed();
            player2_historicalRecords.ShowNoOfWins();
            player2_historicalRecords.ShowNoOfLoss();
            player2_historicalRecords.ShowWinRatio();
            player2_historicalRecords.MostPlayedHands();
        }
    }

    public void ShowPlayer1() {
         Scanner consoleInput = new Scanner(System.in);
         System.out.println("Enter Player 1's Name");
         player1= consoleInput.nextLine();
         System.out.println("--");
         System.out.println("*** Player 1 Name Is : " + player1+ "" +"***");
     }
     public void ShowPlayer2() {
         Scanner consoleInput = new Scanner(System.in);
         System.out.println("Enter Player 2's Name");
         player2= consoleInput.nextLine();
         System.out.println("--");
         System.out.println("*** Player 1 Name Is : " + player2+ "" +"***");
     }
    public void ShowPlayer1_Score() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 1's Scores");
        player1_score = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** Player 1 Name Is : " + player1_score+ "" +"***");
    }

    public void ShowPlayer2_Score() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 2's Scores");
        player2_score = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** Player 1 Name Is : " + player2_score+ "" +"***");
    }

    public void ShowGameProgression() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Who Is Leading and Current Win Ratio");
        gameProgression = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** Player 1 Name Is : " +gameProgression+ " and Is The person Leading" +"***");
    }

}
