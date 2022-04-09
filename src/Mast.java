public enum Mast {

    HEARTS ("ЧЕРВИ"),
    DIAMONDS ("БУБИ"),
    SPADES ("ПИКИ"),
    CLUBS ("КРЕСТИ");

    private String mast;

    Mast(String mast) {
        this.mast = mast;
    }

    @Override
    public String toString() {
        return mast;
    }
}
