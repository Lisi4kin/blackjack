import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Play {
    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        showPlayerHand(game);

        System.out.println("Score = " + game.player.getScore());
    }

    public static void showPlayerHand(Game game) {
        for (int i = 0; i < game.player.hand.size(); i++) {
            System.out.print(game.player.hand.get(i) + " ");
        }
        System.out.println();
    }
}
