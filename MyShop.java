import java.util.ArrayList;

public class MyShop {

    ArrayList<Content> contents = new ArrayList<Content>();

    ArrayList<User> users = new ArrayList<User>();

    public MyShop() {
    }

    public void addContent(Content c) {//To add a content
        contents.add(c);
    }

    public void showContent() {
        //Show a content
        for (Content t1 : contents) {
            System.out.println(t1);
        }
    }

    public void addUser(User u) {
        //to adda user
        users.add(u);
    }

    public void showUser() {
        //To Display the user
        for (User t2 : users) {
            System.out.println(t2);
        }
    }

    public void showAllReviews() {
        // Display all reviews
        System.out.println("All Reviews:\n");
        for (Content t3 : contents) {
            t3.showReviews();
        }
    }

    public void showDownloads() {
        //list down all downloads
        System.out.println("All Downloads:\n");
        for (User t4 : users) {
            if (t4 instanceof Customer)
                ((Customer) t4).showDownloads();
        }
    }

    public void setPrice(boolean check_login, int level_check, double reduction_amount) {
        // For admin level above 5 can alter the content price
        if (check_login && level_check > 5) {

            for (Content temp : contents) {
                double newPrice = temp.getPrice() * (1 + reduction_amount);
                temp.setPrice(newPrice);
            }

            System.out.println("New prices are updated\n");
        } else {
            System.out.println("No privilege to make reduction\n");
        }

    }

}