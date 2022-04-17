import java.util.Scanner;

public class Game {

    Deck deck;
    Player player;
    Player dealer;
    final String win = "Вы выиграли!!! :)";
    final String lose = "Вы проиграли :(";

    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Player();
    }

    public boolean isFinished() {
        if (player.getScore() > 21) {
            return true;
        }
        return false;
    }


    public void startGame() {
        deck.shuffle();
        player.addCard(deck.getOneCard());
        player.addCard(deck.getOneCard());
        dealer.addCard(deck.getOneCard());
    }

    public static void restartGame(Game game) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Начать игру заного? (да/нет) : ");
        String answer = scan.next();
        switch (answer) {
            case "да", "yes", "lf" -> Play.play(game);
            case "нет", "ytn", "no" -> endGame();
            default -> endGame();
        }
    }

    public static void endGame() {
        System.out.println("Спасибо за игру! :)");
    }

    public void check(Game game) {
        if (isFinished() == false) {
            System.out.println(win);
            restartGame(game);
        } else {
            System.out.println(lose);
            restartGame(game);
        }
    }

    public void chois(Game game) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Хотите взять ещё карту? (да/нет) : ");
        String answer = scan.next();
        switch (answer) {
            case "да", "yes", "lf" -> player.addCard(deck.getOneCard());
            case "нет", "ytn", "no" -> check(game);
            default -> check(game);
        }
    }

