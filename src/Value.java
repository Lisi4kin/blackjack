public enum Value {
    TWO("ДВОЙКА"),
    THREE("ТРОЙКА"),
    FOUR("ЧЕТВЕРКА"),
    FIVE("ПЯТЁРКА"),
    SIX("ШЕСТЁРКА"),
    SEVEN("СЕМЁРКА"),
    EIGHT("ВОСЬМЁРКА"),
    NINE("ДЕВЯТКА"),
    TEN("ДЕСЯТКА"),
    JACK("ВАЛЕТ"),
    QUEEN("ДАМА"),
    KING("КОРОЛЬ"),
    ACE("ТУЗ");


    private String label;

    Value(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
