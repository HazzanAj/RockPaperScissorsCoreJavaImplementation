package Models;

import java.util.Scanner;

public class Player1_HistoricalRecords implements RockPaperScissorsGameDevelopment{
    String player1Name, player1NoOfMatches, player1NoOfWins, player1NoOfLoss, player1WinRatio, player1MostPlayedHands;

    @Override
    public void ShowPlayerName(){
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 1 Name");
        player1Name = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Name of Player 1 is: " + player1Name + ""+ "***");
    }

    @Override
    public void ShowMatchesPlayed() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Total Matches Played");
        player1NoOfMatches = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Total Number of Matches Played Is :" + player1NoOfMatches  + ""+ "***");
    }

    @Override
    public void ShowNoOfWins() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Total Number of Games Won");
        player1NoOfWins = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Total Number of Game Won Is : " + player1NoOfWins + ""+ "***");

    }

    @Override
    public void ShowNoOfLoss() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Total Number of Games Loss");
        player1NoOfLoss = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** The Total Number of Game Loss Is : " + player1NoOfLoss + ""+ "***");
    }

    @Override
    public void ShowWinRatio() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 1 Game Win Ratio");
        player1WinRatio = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** Player 1 Game Win Ratio Is :" + player1WinRatio  + ""+ "***");
    }

    @Override
    public void MostPlayedHands() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter Player 1 Most Played Hands");
        player1MostPlayedHands = consoleInput.nextLine();
        System.out.println("--");
        System.out.println("*** Player 1 Most Played Hands Is " + player1MostPlayedHands + ""+ "***");
    }
}
