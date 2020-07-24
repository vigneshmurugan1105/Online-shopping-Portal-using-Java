import java.util.ArrayList;

public class Customer extends User {

    private String phone;
    private double funds;
    private String Content[];
    private boolean download = false;
    private boolean premium = false;
    ArrayList<Content> download_list = new ArrayList<Content>();


    public Customer(String ID, String username, String phone, double funds) {
        super(ID, username);

        this.phone = phone;
        this.funds = funds;
    }

    public Customer(String ID, String username, String phone) {
        super(ID, username);

        this.phone = phone;
        this.funds = 50;
    }

    public String toString() {
        return super.toString() + "    phone: " + phone + "     funds: " + funds + "\n";
    }


    public void becomePremium() {
        // Premium subscription

        if (funds > 100) {
            funds -= 100;
            premium = true;

        } else {
            System.out.println("Sorry....Insufficient Balance\n");

        }

    }

    public boolean download(Content obj) {
       //Purchase a content
        double content_price = obj.getPrice();

        if (premium == true) {

            content_price *= 0.8;
            //System.out.println("Premium User price"+content_price);

            if (funds >= content_price) {
                download_list.add(obj);
                funds -= obj.getPrice();
                obj.getDownloadNo();
            }
            return true;
        } else if ((!premium) && (funds >= content_price)) {
            download_list.add(obj);
            funds -= obj.getPrice();
            obj.getDownloadNo();
            return true;
        } else
            return false;

    }

    public boolean download(Content[] list) {
        //To make a bulk purchase
        for (int i = 0; i < list.length; i++) {
            double content_price = list[i].getPrice();
            if (premium == true) {

                content_price *= 0.8;
                //System.out.println("Premium User price"+content_price);

                if (funds >= content_price) {
                    download_list.add(list[i]);
                    funds -= list[i].getPrice();
                    list[i].getDownloadNo();
                }

            } else if ((!premium) && (funds >= content_price)) {
                download_list.add(list[i]);
                funds -= list[i].getPrice();
                list[i].getDownloadNo();

            } else
                System.out.println("The download is not successful for content" + list[i].getName());


        }
        return true;
    }

    public void showDownloads() {
        //List the downloads made by a customer
        System.out.println("\nThe download list for the Customer:  " + getID() + "     Name: " + getUserName() + "\n");
        if (download_list.size() == 0) {
            System.out.println("No Downloads yet");
            System.out.println("--------------------------------------------\n");
        } else {
            for (Content c : download_list) {
                System.out.println(c.getName());
            }

            System.out.println("-------------------");
        }
    }
}
