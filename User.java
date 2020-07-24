import java.util.ArrayList;

public class User {
    private String ID;
    private String userName;
    Customer ob;

    public User(String ID, String userName) {

        this.ID = ID;
        this.userName = userName;
    }

    public String getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }


    public boolean setUsername(String userName) {
        this.userName = userName;
        return false;
    }

    @Override
    public String toString() {
        return "ID=" + ID + "   userName=" + userName;
    }

    public void changeName(String checkname) {

        this.userName = checkname;
    }


    public void showDownloads() {
        ob.showDownloads();
    }

}