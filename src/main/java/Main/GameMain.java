package Main;

import Models.GameInProgress;
import Models.Player1_HistoricalRecords;
import Models.Player2_HistoricalRecords;

public class GameMain {
    public static void main(String[] args) {
        GameInProgress gameInProgress = new GameInProgress();
        gameInProgress.ShowGaveStage();
        /**
        * This was Implemented for us to keep track of player 1 historical records
        * ********************/
        Player1_HistoricalRecords player1_historicalRecords = new  Player1_HistoricalRecords();
        player1_historicalRecords.ShowPlayerName();
        player1_historicalRecords.ShowMatchesPlayed();
        player1_historicalRecords.ShowNoOfWins();
        player1_historicalRecords.ShowNoOfLoss();
        player1_historicalRecords.ShowWinRatio();
        player1_historicalRecords.MostPlayedHands();

        /**
         * This was Implemented for us to keep track of player 1 historical records
         * ******************/
        Player2_HistoricalRecords player2_historicalRecords = new  Player2_HistoricalRecords();
        player2_historicalRecords.ShowPlayerName();
        player2_historicalRecords.ShowMatchesPlayed();
        player2_historicalRecords.ShowNoOfWins();
        player2_historicalRecords.ShowNoOfLoss();
        player2_historicalRecords.ShowWinRatio();
        player2_historicalRecords.MostPlayedHands();
        gameInProgress.ShowPlayer1();
        gameInProgress.ShowPlayer2();
        gameInProgress.ShowPlayer1_Score();
        gameInProgress.ShowPlayer2_Score();
        gameInProgress.ShowGameProgression();
    }

    }
