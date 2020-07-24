import java.util.Scanner;

public class Admin extends User {
    private String password;
    private int level;

    public Admin(String ID, String username, String password, int level) {
        super(ID, username);

        this.level = level;
        this.password = password;
    }

    public int getLevel()
    {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + "    password:  " + password + "      level: " + level + "\n";
    }

    public boolean login() {
        // To check the Admin login
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter password");
        String User_password = s1.next();
        if (User_password.equals(password)) {
            System.out.println("The login is successful");
            return true;
        } else {
            System.out.println("No privilege\n");
            return false;
        }
    }
}

