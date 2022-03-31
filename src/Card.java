public class Card {
    private Value value;
    private Mast mast;


    public Card(Value value, Mast mast) {
        this.value = value;
        this.mast = mast;
    }


    public Value getValue() {
        return value;
    }

    public Mast getMast() {
        return mast;
    }

    //переопределение метода toString
    public String toString() {
        return "[" + value + " - " + mast + "]";
    }
}
