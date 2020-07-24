// My name:
// My student ID:
// The highest level I've completed is: PASS/CR/DI/HD (select ONLY one)

//Add the packages that you need

import java.util.Scanner;

public class MyShopMain {
    public static void main(String[] args) {

        Content obj = null;
        String Content_ID;
        String name;
        double price;
        String osType;
        String publisher;
        int volume;
        int noOf_Page;
        int option = 0;
        String User_ID;
        String userName;
        String phone;
        double funds;
        String password;
        int level;

        Scanner scanner = new Scanner(System.in);
        MyShop shop = new MyShop();

        String[] authors1 = {"L. Tolstoy"};
        Book b1 = new Book("b1", "War and Peace", 12.55, "The Russian Messenger", 1225, authors1);

        String[] authors2 = {"F. Scott Fitzgerald"};
        Book b2 = new Book("b2", "The great gatsby", 10, "Charles Scribner's Sons", 180, authors2);

        String[] authors3 = {"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"};
        Book b3 = new Book("b3", "Introduction to algorithms", 100, "MIT Press", 1312, authors3);

        Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);

        shop.addContent(b1);
        shop.addContent(b2);
        shop.addContent(b3);
        shop.addContent(m1);

        Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4");
        Application g2 = new Application("g2", "Pokemon", 5, "iOSV10");

        Application app1 = new Application("app1", "Calendar", "androidV3");


        shop.addContent(g1);
        shop.addContent(g2);
        shop.addContent(app1);

        //shop.showContent();

        Customer c1 = new Customer("c1", "coolguy", "0412000", 200);
        Customer c2 = new Customer("c2", "neversaynever", "0433191");
        Customer c3 = new Customer("c3", "Hello 123", "0413456", 1000);
        Customer c4 = new Customer("c4", "Jackie Chan", "0417654");

        shop.addUser(c1);
        shop.addUser(c2);
        shop.addUser(c3);
        shop.addUser(c4);


        Admin a1 = new Admin("a1", "SuperBlack", "opensesame", 10);
        Admin a2 = new Admin("a2", "Adele", "kitty123", 3);

        shop.addUser(a1);
        shop.addUser(a2);

        // shop.showUser();

        c2.changeName("neversaybye");  // change the user name
        a1.changeName("superblack");   // make the user name in lowercase

        // shop.showUser();

        Comment comment1 = new Comment(c1, "This is a fantastic game!");
        g1.addReview(comment1);

        Comment comment2 = new Comment(c2, 5);
        g1.addReview(comment2);

        Comment comment3 = new Comment(c3, 3, "This is an average game!");
        g1.addReview(comment3);

        Comment comment4 = new Comment(c4, "I quite like this game!", 4);
        g1.addReview(comment4);

        g1.addReview(new Comment(c3, "The game crashes frequently"));

        b1.addReview(new Comment(c2, "I love Tolstoy!"));

        //  g1.showReviews();
        //  b1.showReviews();
        // shop.showAllReviews();


        if (c1.download(b1))
            System.out.println(c1.getUserName() + " bought " + b1.getName() + "\n");
        else
            System.out.println("Not enough fund");

        c1.download(b3);
        c1.download(m1);

        // c1.showDownloads();

        c2.download(m1);
        c3.download(m1);

        //   m1.showDownloads();
        //   shop.showDownloads();

        c3.becomePremium();
        c3.download(b1);
        c3.download(g1);
        // shop.showDownloads();

        c4.download(g1);
        c4.becomePremium();
        c4.download(m1);
        //  shop.showDownloads();

        Customer c5 = new Customer("c5", "neverenough", "0486734", 2000);
        Content[] list = {b1, b2, b3, m1, g1, g2, app1};

        shop.addUser(c5);
        c5.download(list);
        // shop.showDownloads();

        b1.setPrice(a2.login(), 14.25);

        shop.setPrice(a1.login(), a1.getLevel(), -0.10);

        do {
            try {//Menu
                System.out.println("The menu List :\n1.Show All Contents\n2.Display All Users\n3.Add a new Content\n" +
                        "4.Add a new user\n5. List all review\n6.Display all downloads\n7.Individual content reviews\n" +
                        "8.Download list for a customer\n9.Particular content download information\n10.Exit\n");
                System.out.println("Enter the menu option");
                String opt = scanner.nextLine();
                switch (opt) {
                    case "1":
                        shop.showContent();
                        option = 1;
                        break;

                    case "2":
                        shop.showUser();
                        option = 1;
                        break;


                    case "3":
                        try {
                            System.out.println("Enter the type of content/n1.Application/n2.Book/n3.Magazine");

                            int value = scanner.nextInt();
                            switch (value) {
                                case 1:
                                    scanner.nextLine();
                                    System.out.println("Enter the values:\nID:");
                                    Content_ID = scanner.nextLine();
                                    System.out.println("\nName:");
                                    name = scanner.nextLine();
                                    System.out.println("\nprice:");
                                    price = scanner.nextDouble();
                                    scanner.nextLine();
                                    System.out.println("\nOstype:");
                                    osType = scanner.nextLine();
                                    shop.addContent(new Application(Content_ID, name, price, osType));
                                    break;
                                case 2:
                                    scanner.nextLine();
                                    System.out.println("Enter the values:\nID:");
                                    Content_ID = scanner.nextLine();

                                    System.out.println("\nName:");
                                    name = scanner.nextLine();

                                    System.out.println("\nprice:");
                                    price = scanner.nextDouble();
                                    scanner.nextLine();
                                    System.out.println("\nPublisher:");
                                    publisher = scanner.nextLine();

                                    System.out.println("\nNo_of_pages:");
                                    noOf_Page = scanner.nextInt();

                                    System.out.println("\nNo_of authors");
                                    int arraysize = scanner.nextInt();

                                    String[] author = new String[arraysize];
                                    scanner.nextLine();
                                    for (int i = 0; i < author.length; i++) {
                                        System.out.println("\nEnter the  author name:");

                                        author[i] = scanner.nextLine();

                                    }
                                    shop.addContent(new Book(Content_ID, name, price, publisher, noOf_Page, author));

                                    break;
                                case 3:
                                    scanner.nextLine();
                                    System.out.println("Enter the values:\nID:");
                                    Content_ID = scanner.nextLine();
                                    System.out.println("\nName:");
                                    name = scanner.nextLine();
                                    System.out.println("\nprice:");
                                    price = scanner.nextDouble();
                                    scanner.nextLine();
                                    System.out.println("\nPublisher:");
                                    publisher = scanner.nextLine();
                                    System.out.println("\nNo_of_pages:");
                                    noOf_Page = scanner.nextInt();
                                    System.out.println("\nEnter the volume:");
                                    volume = scanner.nextInt();
                                    shop.addContent(new Magazine(Content_ID, name, price, publisher, noOf_Page, volume));
                                    break;

                                default:
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Enter a valid input");
                        }
                        option = 1;
                        break;

                    case "4":
                        try {
                            System.out.println("Enter the type of User/n1.Customer/n2.Admin");

                            int value1 = scanner.nextInt();
                            switch (value1) {
                                case 1:
                                    scanner.nextLine();
                                    System.out.println("Enter the values:\nID:");
                                    User_ID = scanner.nextLine();
                                    System.out.println("\nName:");
                                    name = scanner.nextLine();
                                    System.out.println("\nPhone:");
                                    phone = scanner.nextLine();
                                    System.out.println("\nfunds:");
                                    funds = scanner.nextDouble();
                                    shop.addUser(new Customer(User_ID, name, phone, funds));
                                    break;

                                case 2:
                                    scanner.nextLine();
                                    System.out.println("Enter the values:\nID:");
                                    User_ID = scanner.nextLine();
                                    System.out.println("\nName:");
                                    name = scanner.nextLine();
                                    System.out.println("\nPassword:");
                                    password = scanner.nextLine();
                                    System.out.println("\nLevel:");
                                    level = scanner.nextInt();
                                    shop.addUser(new Admin(User_ID, name, password, level));
                                    break;

                                default:
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Enter a valid input");
                        }
                        option = 1;
                        break;

                    case "5":
                        shop.showAllReviews();
                        option = 1;
                        break;

                    case "6":
                        shop.showDownloads();
                        option = 1;
                        break;

                    case "7":
                        g1.showReviews();
                        b1.showReviews();
                        option = 1;
                        break;

                    case "8":
                        c1.showDownloads();
                        option = 1;
                        break;

                    case "9":
                        m1.showDownloads();
                        option = 1;
                        break;

                    case "10":
                        option = 0;
                        System.out.println("thank you");
                        break;

                    default:
                        option = 1;
                        System.out.println("Enter the valid input");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter a valid option");
            } //exit loop when option = 0
        } while (option == 1);

    }
}