import controllers.GameController;
import models.Game;
import models.GameState;

public class Main {
    public static void main(String[] args) {

        GameController gameController = new GameController();

        while(gameController.checkState() == GameState.IN_PROGRESS){
            gameController.displayBoard();
            gameController.makeMove();
        }

        if (gameController.checkState()==GameState.SUCCESS){
            System.out.printf("Winner is " + gameController.getWinner().GetName());
        }
    }
}