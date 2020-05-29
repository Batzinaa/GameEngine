package org.example;


import com.fasterxml.jackson.annotation.JsonGetter;
import org.example.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameConfiguration {

    private List<Square> squares;

    private List<Player> players;

    private BoardType boardType;

    private int numberOfDice;

    private int numberOfPiecesPerPlayer;

    private WinningCondition winningCondition;

    public GameConfiguration() {
        this(BoardType.SPRINT, 1, 1, new LastSquareWinningCondition(),
                new ArrayList<Square>(Arrays.asList(
                        new DefaultSquare(),
                        new LadderSquare(4),
                        new DefaultSquare(),
                        new DefaultSquare(),
                        new SnakeSquare(3),
                        new DefaultSquare(),
                        new DefaultSquare(),
                        new DefaultSquare(),
                        new LadderSquare(2),
                        new DefaultSquare(),
                        new DefaultSquare(),
                        new LadderSquare(6),
                        new DefaultSquare(),
                        new DefaultSquare(),
                        new LadderSquare(5),
                        new DefaultSquare(),
                        new DefaultSquare(),
                        new DefaultSquare(),
                        new SnakeSquare(3),
                        new DefaultSquare()
                )),
                new ArrayList<Player>(Arrays.asList(
                        new Player("player1"),
                        new Player("player2"),
                        new Player("player3"),
                        new Player("player4")
                )));
    }

    public GameConfiguration(BoardType boardType,
                             int numberOfDice,
                             int numberOfPiecesPerPlayer,
                             WinningCondition winningCondition,
                             List<Square> squares,
                             List<Player> players) {
        this.squares = squares;
        this.players = players;
        this.boardType = boardType;
        this.numberOfDice = numberOfDice;
        this.numberOfPiecesPerPlayer = numberOfPiecesPerPlayer;
        this.winningCondition = winningCondition;
    }

    @JsonGetter
    public List<Square> getSquares() {
        return squares;
    }

    @JsonGetter
    public List<Player> getPlayers() {
        return players;
    }

    @JsonGetter
    public BoardType getBoardType() {
        return boardType;
    }

    @JsonGetter
    public int getNumberOfPiecesPerPlayer() {
        return numberOfPiecesPerPlayer;
    }

    @JsonGetter
    public int getNumberOfDice() {
        return numberOfDice;
    }

    @JsonGetter
    public WinningCondition getWinningCondition() {
        return winningCondition;
    }
}
