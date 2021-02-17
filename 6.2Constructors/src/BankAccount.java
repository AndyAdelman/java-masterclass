public class BankAccount {

    public static void main(String[] args) {

        //account constructor with parameters
        BankAccount tim = new BankAccount(); //without parameters
//                124,
//                0.00,
//                "Tim Timmy",
//                "tim@tim.com",
//                1234567890
        //);

        System.out.println(tim.getAccountNumber());
        System.out.println(tim.getBalance());
        System.out.println(tim.getCustomerName());

        tim.setAccountNumber(124);
        tim.setBalance(0.00);
        tim.setCustomerName("Tim Timmy");
        tim.setEmail("tim@tim.com");
        tim.setPhoneNumber(1234567890);
        //you don't need all these set statements
        //the constructor is called when you create a new object

        System.out.println(Double.toString((tim.getBalance())));
        tim.setDeposit(5.00d);
        tim.setWithdrawal(1.00d);
        System.out.println(Double.toString((tim.getBalance())));
        tim.setDeposit(-1.00d);
        tim.setWithdrawal(-1.00d);
        tim.setWithdrawal(100.00);
        System.out.println(Double.toString((tim.getBalance())));

    }

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    //This is your constructor
    public BankAccount(int accountNumber,
                       double balance,
                       String customerName,
                       String email,
                       int phoneNumber){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //you could use setters here. that would automatically include
        //any validation you used in the setters. However, due to
        //inheritance, using setters is bad practice. you might also run
        // into problems with intialization as you are creating an instance
        // variable when you call a constructor. you shouldn't
        //call other methods in you constructor unless you're calling
        //another constructor. Save the field values directly.

    }

    //generate using  code > generate > select the fields you want
    //you can edit the constructor to use "this" defaults plus parameters
    public BankAccount(String customerName, String email, int phoneNumber) {

        this(124, 0.00d, customerName, email, phoneNumber);

        //automatically generated
        //this.customerName = customerName;
        //this.email = email;
        //this.phoneNumber = phoneNumber;
    }

    //constructors can be overloaded
    //constructors can call other constructors
    //a blank constructor can call a constructor with parameters
    //eg you'd do this to set default values for an object

    //another way to call a constructor
    //"this" only works if used as the first line in the constructor
    //these will be the default values
    public BankAccount(){
        this(124, 0.00, "Tim Timmy","tim@tim.com", 1234567890);
    }



    public void setDeposit(double depositAmount){

        if(depositAmount < 0.00d){
            System.out.println("Invalid Deposit Amount");
        } else {
            this.balance += depositAmount;
        }
    }

    public void setWithdrawal(double withdrawAmount){

        if(withdrawAmount < 0.00d){
            System.out.println("Invalid Withdraw Amount");
        } else if ((this.balance - withdrawAmount) < 0.00d){
            System.out.println("Insufficient Funds");
        } else {
            this.balance -= withdrawAmount;
        }
    }

    //Getters - Code >> Generate
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    //Setters - Code >> Generate
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

