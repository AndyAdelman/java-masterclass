public class BankAccount {

    public static void main(String[] args) {

        BankAccount tim = new BankAccount();

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
