public class VipPerson {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson(){
        this("Default name",50000,"default@mail.com");
        System.out.println("empty constructor created for vip person");
    }

    public VipPerson(String name, double creditLimit) {
        this(name,creditLimit,"unknown");
    }

    //The first 2 constructors call this one, and this one is the only 1 to update
    //the class variables (fields)
    public VipPerson(String name, double creditLimit, String emailAddress) {
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
