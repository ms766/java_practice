public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadTollType;

    private String additionNameOne;
    private double additionalPriceOne;
    private String additionNameTwo;
    private double additionalPriceTwo;
    private String additionNameThree;
    private double additionalPriceThree;
    private String additionNameFour;
    private double additionalPriceFour;

    public Hamburger(String name, String meat, double price, String breadTollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadTollType = breadTollType;
    }

    public void addHamburgerAdditionOne(String name, double price){
        this.additionNameOne = name;
        this.additionalPriceOne = price;
    }

    public void addHamburgerAdditionTwo(String name, double price){
        this.additionNameTwo = name;
        this.additionalPriceTwo = price;
    }

    public void addHamburgerAdditionThree(String name, double price){
        this.additionNameThree = name;
        this.additionalPriceThree = price;
    }

    public void addHamburgerAdditionFour(String name, double price){
        this.additionNameFour = name;
        this.additionalPriceFour = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger  " + this.breadTollType + " roll "
                          + " price is " + this.price);
        if(this.additionNameOne != null){
            hamburgerPrice += this.additionalPriceOne;
            System.out.println("Added " + this.additionNameOne + " for an extra " + this.additionalPriceOne);
        }
        if(this.additionNameTwo != null){
            hamburgerPrice += this.additionalPriceTwo;
            System.out.println("Added " + this.additionNameTwo + " for an extra " + this.additionalPriceTwo);
        }
        if(this.additionNameThree != null){
            hamburgerPrice += this.additionalPriceThree;
            System.out.println("Added " + this.additionNameThree + " for an extra " + this.additionalPriceThree);
        }
        if(this.additionNameFour != null){
            hamburgerPrice += this.additionalPriceFour;
            System.out.println("Added " + this.additionNameFour + " for an extra " + this.additionalPriceFour);
        }

        return hamburgerPrice;
    }
}
