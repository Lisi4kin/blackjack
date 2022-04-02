public enum Mast {
    Hearts ("ЧЕРВИ"),
    Diamonds ("БУБИ"),
    Spades ("ПИКИ"),
    Clubs ("КРЕСТИ");

    private String mast;

    Mast(String mast) {
        this.mast = mast;
    }

    @Override
    public String toString() {
        return mast;
    }
}
