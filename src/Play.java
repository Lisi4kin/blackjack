import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Play {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Collections.shuffle(deck.cards); // перетасовка карт
        deck.cards.forEach(System.out::println);
    }
}
