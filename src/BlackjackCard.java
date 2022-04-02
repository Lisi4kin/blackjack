public class BlackjackCard extends Card {

    public BlackjackCard(Value value, Mast mast) {
        super(value, mast);
    }
    public int getScore() {
        return switch (value) {
            case TWO -> 2;
            case THREE -> 3;
            case FOUR -> 4;
            case FIVE -> 5;
            case SIX -> 6;
            case SEVEN -> 7;
            case EIGHT -> 8;
            case NINE -> 9;
            case ACE -> 11; //пока забей
            default -> 10;
        };
    }
}
