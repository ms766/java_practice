//inherit from animal

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //dog constructor--------------------------------------------------------------------
    public Dog(String name, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        //super calls the constructor for the class that is being extented!
        super(name, 1, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //dog constructor--------------------------------------------------------------------

    private void chew(){
        System.out.println("dog chewing");
    }

    @Override
    public void eat() {
        System.out.println("dog eat called");
        chew();
        super.eat();

    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(90);
    }

    public void run(int speed){
        System.out.println("Dog.run() called");
        move(190);
    }

    public void moveLegs(int speed){
        System.out.println("legs moving @ "+speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(100);
        super.move(speed);
    }
}
