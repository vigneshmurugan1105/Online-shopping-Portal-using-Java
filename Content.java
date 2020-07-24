import java.util.ArrayList;

public class Content {
    private String ID;
    private String name;
    private int downloadNo;
    private double price;

    ArrayList<Comment> review = new ArrayList<Comment>();

    Content(String ID, String name, int downloadNo, double price) {
        this.ID = ID;
        this.name = name;
        this.downloadNo = downloadNo;
        this.price = price;
    }

    public String getID() {
        return ID;
    }


    public String getName() {
        return name;
    }

    public int getDownloadNo() {
        downloadNo++;
        return downloadNo;
    }

    public void showDownloads() {
        System.out.println("The content ID: " + ID + "     Name   :" + name + "  No_of_downloads :  " + downloadNo + "\n");
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "ID: " + ID + "    Name:" + name + "   No_of_downloads:" + downloadNo + "   price :" + price;
    }

    public void addReview(Comment c) {
        review.add(c);
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setPrice(boolean result, double price) {
        if (result) {
            this.price = price;
            System.out.println("Price is changed");
        }

    }

    public void showReviews() {
        //Display the list of reviews
        System.out.println("ID:  " + getID() + "   Name   : " + getName() + "\n");
        if (review.size() == 0) {
            System.out.println("No reviews yet");
            System.out.println("--------------------------------------------\n");
        } else {
            for (Comment temp : review) {
                System.out.println(temp);
            }
            System.out.println("--------------------------------------------\n");
        }
    }
}
