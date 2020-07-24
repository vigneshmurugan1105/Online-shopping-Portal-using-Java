import java.util.Arrays;

public class Book extends Publication {
    private String[] authors;

    Book(String ID, String name, double price, String publisher, int noOf_Page, String[] authors) {
        super(ID, name, price, publisher, noOf_Page);
        this.authors = authors;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String toString() {
        return super.toString() + "     Authors: " + Arrays.toString(authors) + "\n";
    }
}