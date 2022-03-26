public class BlackjackCard extends Card {

    public BlackjackCard(Value value, Mast mast) {
        super(value, mast);
    }
    public int getScore() {
        return switch (value) {
            case ДВОЙКА -> 2;
            case ТРОЙКА -> 3;
            case ЧЕТВЕРКА -> 4;
            case ПЯТЁРКА -> 5;
            case ШЕСТЁРКА -> 6;
            case СЕМЁРКА -> 7;
            case ВОСЬМЁРКА -> 8;
            case ДЕВЯТКА -> 9;
            case ТУЗ -> 11; //пока забей
            default -> 10;
        };
    }
}
