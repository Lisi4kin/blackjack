import java.util.ArrayList;
import java.util.List;

public class Player {
    ArrayList<Card> hand = new ArrayList<>();


    public void addCard(Card card) {
        hand.add(card);
    }
    public void clearHand() {
        hand.clear();
    }
    public int showScore() {
        hand.forEach();
    }
}
