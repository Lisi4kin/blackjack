public class Game {

    Deck deck;
    Player player;
    Player dealer;

    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Player();
    }

    public boolean isFinished() {
        if (player.getScore() >= 21) {
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
}
