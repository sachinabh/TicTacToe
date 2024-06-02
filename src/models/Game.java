package models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Game {
    private Board board;
    private List<Player> playerList;
    private List<Move> moveList;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;

}
