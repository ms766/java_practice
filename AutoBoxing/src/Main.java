public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adel");
        bank.addCustomer("Adel","Tim",50.05);
        bank.addCustomer("Adel","Mike",150.05);
        bank.addCustomer("Adel","Percy",520.05);
        bank.addBranch("Syd");
        bank.addCustomer("Syd","Bob",20.10);

        bank.addCustomerTransaction("Adel","Tim",44.22);
        bank.addCustomerTransaction("Adel","Tim",34.22);
        bank.addCustomerTransaction("Adel","Tim",14.22);

        bank.listCustomers("Adel",true);
    }
}