public class Application extends Content {

    private String OStype;

    Application(String ID, String name, double price, String OStype) {
        super(ID, name, 0, price);
        this.OStype = OStype;
    }

    Application(String ID, String name, String OStype) {
        super(ID, name, 0, 0.0);
        this.OStype = OStype;
    }

    public String getOStype() {
        return OStype;
    }

    public String toString() {
        return super.toString() + "   OStype  :" + OStype + "\n";
    }


}
