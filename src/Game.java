import java.util.Scanner;

public class Game {

    Deck deck;
    Player player;
    Player dealer;

    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Player();
    }

    public boolean isPlayerLost() {
        if (player.getScore() > 21) {
            return true;
        }
        return false;
    }


    public void startGame() {
        player.clearHand();
        deck.shuffle();
        player.addCard(deck.getOneCard());
        player.addCard(deck.getOneCard());
        dealer.addCard(deck.getOneCard());
    }

    public boolean playerTakesCard() {
        if (askAction()) {
            player.addCard(deck.getOneCard());
            return true;
        } else {
            return false;
        }
    }
    public boolean dealerTakesCard() {
        if (dealer.getScore() < 17) {
            dealer.addCard(deck.getOneCard());
            return true;
        } else {
            return false;
        }
    }

    public boolean askAction() {
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        return switch (answer) {
            case "да", "yes", "lf" -> true;
            case "нет", "ytn", "no" -> false;
            default -> askAction();
        };
    }
//    public int whoWin() {
//
//    }
}

