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

    public int getScore() {
        int score = 0;
        for (int i = 0; i < hand.size(); i++) {

            score += switch (hand.get(i).value) {
                case TWO -> 2;
                case THREE -> 3;
                case FOUR -> 4;
                case FIVE -> 5;
                case SIX -> 6;
                case SEVEN -> 7;
                case EIGHT -> 8;
                case NINE -> 9;
                case ACE -> {
                    if (score > 10) {
                        yield 1;
                    } else {
                        yield 11;
                    }
                }
                default -> 10;
            };
        }
        return score;
    }


}
