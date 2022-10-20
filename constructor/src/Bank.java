public class Bank {
    private String acountNumber;
    private double balance;
    private String custName;
    private String email;
    private String phoneNumber;

    //Constructor
    public Bank(){
        //calling a constructor from within a constructor
        //calls constructor below
        this("5678",2.50,"adam","adam@mail.com","000000");

        System.out.println("Empty Constructor called");
    }

    //here
    public Bank(String number,double balance, String custName,String email,String phonenum){
        this.acountNumber = number;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNumber = phonenum;
    }


    public String getAcountNumber() {
        return acountNumber;
    }
    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdrawl(double withdrawlAmount){
        if(this.balance - withdrawlAmount < 0){
            System.out.println("funds lacking");
        }else{
            this.balance -= withdrawlAmount;
            System.out.println("withdrawl done");
            System.out.println("remaining balance:"+ this.balance);
        }
    }



}
