public class Card {
    private int value;
    private Mast mast;

    public Card(int value, Mast mast) {
        this.value = value;
        this.mast = mast;
    }

    public int getValue() {
        return value;
    }

    public Mast getMast() {
        return mast;
    }
}
