import java.util.Scanner;
import java.util.Timer;

public class Play {

    public static void main(String[] args) {


        Game game = new Game();
        play(game);
    }

    public static void play(Game game) {
        game.player.clearHand();
        game.startGame();
        showPlayerHand(game);
        System.out.println("Score = " + game.player.getScore());

        Game.restartGame(game);
    }

    public static void showPlayerHand(Game game) {
        for (int i = 0; i < game.player.hand.size(); i++) {
            System.out.print(game.player.hand.get(i) + " ");
        }
        System.out.println();
    }

}
