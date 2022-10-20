public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAdditionOne("Tomato",0.27);
        price = hamburger.itemizeHamburger();


    }
}