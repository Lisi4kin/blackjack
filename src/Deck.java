import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        for (var i = 0; i <= 12; i++) {
            for (int j = 0; j <= 3; j++) {
                cards.add(new Card(Value.values()[i], Mast.values()[j]));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card getOneCard(){
        if (cards.size() != 0) {
            Card card = cards.get(0);
            cards.remove(0);
            return card;
        }
        return null;
    }

}
