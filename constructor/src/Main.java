public class Main {
    public static void main(String[] args) {

        Bank accountx = new Bank();
        System.out.println(accountx.getCustName()+'\n');

        Bank account = new Bank("0001",0.02,"monkey man",
                "monkey@mail.com","123-123-4567");

        System.out.println(account.getCustName());

        //how things would be set if there was no constructor
        account.setAcountNumber("123445");
        account.setBalance(0.00F);
        account.setCustName("Bob Brown");
        account.setEmail("bob@apple.com");
        account.setPhoneNumber("(087) 123-1234");
        account.withdrawl(10);
        account.deposit(3000);
        account.withdrawl(100);

        System.out.println(account.getCustName());

        VipPerson person = new VipPerson();
        System.out.println(person.getName());

        VipPerson person2 = new VipPerson("bob",2300);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("bob3",444300,"xxx@mail.com");
        System.out.println(person3.getName());

    }
}