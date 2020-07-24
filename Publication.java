public class Publication extends Content {
    private String publisher;
    private int noOf_Page;

    Publication(String ID, String name, double price, String publisher, int noOf_Page) {
        super(ID, name, 0, price);
        this.publisher = publisher;
        this.noOf_Page = noOf_Page;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNoOf_Page() {
        return noOf_Page;
    }

    public String toString() {
        return super.toString() + "   publisher :" + publisher + "      No_of_pages  :  " + noOf_Page;
    }

}
