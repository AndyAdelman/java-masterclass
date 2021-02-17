public class VipCustomer {

    public static void main(String[] args) {

        VipCustomer vipOne = new VipCustomer();
        VipCustomer vipTwo = new VipCustomer(100.00d, "something else");
        VipCustomer vipThree = new VipCustomer("Jimbob", 90.00d, "JB@me.com");

        System.out.println("name: " + vipOne.getName());
        System.out.println("limit: " + vipOne.getCreditLimit());
        System.out.println("email: " + vipOne.getEmailAddress());
        System.out.println();
        System.out.println("name: " + vipTwo.getName());
        System.out.println("limit: " + vipTwo.getCreditLimit());
        System.out.println("email: " + vipTwo.getEmailAddress());
        System.out.println();
        System.out.println("name: " + vipThree.getName());
        System.out.println("limit: " + vipThree.getCreditLimit());
        System.out.println("email: " + vipThree.getEmailAddress());
    }

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer() {

        this("default name", 0.00d, "default email");

    }

    public VipCustomer(double creditLimit, String emailAddress) {

        //this.name = "default name";
        //this.creditLimit = creditLimit;
        //this.emailAddress = emailAddress;

        //alternatively
        this("default name", creditLimit, emailAddress);
        //better
        //now only one constructor that actually saves values to our field
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
