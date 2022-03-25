import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    public Deck() {
        for (var i = 0; i <= 12; i++) {
            for (int j = 0; j <= 3; j++) {
                cards.add(new Card(Value.values()[i], Mast.values()[j]));
            }
        }
    }

}
