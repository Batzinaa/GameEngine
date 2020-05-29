package org.example;


import org.example.model.BoardGame;
import org.example.model.IBoard;
import org.example.model.PlayerList;
import org.example.model.WinningCondition;

public class App {
    public static void main(String[] args) {
        //serialize gameConfiguration into json
        /*GameConfiguration gameConfiguration = new GameConfiguration();
        String json = JacksonManager.serialize(gameConfiguration);*/

        GameConfiguration gameConfiguration1 = JacksonManager.deserialize("gameConfiguration.json");
        BoardGameFactory boardGameFactory = new BoardGameFactory(gameConfiguration1);

        IBoard constructedBoard = boardGameFactory.getBoard();
        PlayerList constructedPlayers = boardGameFactory.getPlayerList();
        WinningCondition constructedWinningCondition = boardGameFactory.getWinningCondition();

        BoardGame boardGame = new BoardGame(constructedBoard, boardGameFactory.getNumberOfDice(), constructedPlayers, constructedWinningCondition);
        boardGame.play();
    }
}
