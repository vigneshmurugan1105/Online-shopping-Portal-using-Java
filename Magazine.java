public class Magazine extends Publication {

    private int volume;

    Magazine(String ID, String name, double price, String publisher, int noOf_Page, int volume) {
        super(ID, name, price, publisher, noOf_Page);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return super.toString() + "       Volume: " + volume + "\n";
    }
}
