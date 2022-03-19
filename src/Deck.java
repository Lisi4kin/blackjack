import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        for (int i = 2; i <= 14; i++) {
            for (int j = 0; j <= 3; j++) {
                cards.add(new Card(i, Mast.values()[j]));
            }
        }
    }
    
}
