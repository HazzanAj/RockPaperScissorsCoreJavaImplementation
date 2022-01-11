package Models;

import java.util.Scanner;

public class Player2_HistoricalRecords implements RockPaperScissorsGameDevelopment {
    String player2Name, player2NoOfMatches, player2NoOfWins, player2NoOfLoss, player2WinRatio, player2MostPlayedHands;

    @Override
    public void ShowPlayerName(){
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 2 Name");
        player2Name = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Name of Player 2 is: " + player2Name + ""+ "***");
    }

    @Override
    public void ShowMatchesPlayed() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Total Matches Played");
        player2NoOfMatches = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Total Number of Matches Played Is :" + player2NoOfMatches + "" + "***");
    }
    @Override
    public void ShowNoOfWins() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Total Number of Games Won");
        player2NoOfWins = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Total Number of Game Won Is : " + player2NoOfWins + ""+ "***");

    }

    @Override
    public void ShowNoOfLoss() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Total Number of Games Loss");
        player2NoOfLoss = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Total Number of Game Loss Is : " + player2NoOfLoss + ""+ "***");
    }

    @Override
    public void ShowWinRatio() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 2 Game Win Ratio");
        player2WinRatio = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** Player 1 Game Win Ratio Is :" + player2WinRatio  + ""+ "***");
    }

    @Override
    public void MostPlayedHands() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 2 Most Played Hands");
        player2MostPlayedHands = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** Player 1 Most Played Hands Is " + player2MostPlayedHands + ""+ "***");
    }
}
