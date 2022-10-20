public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isMan;
    private int curGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isMan) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isMan = isMan;
        this.curGear = 1;
    }

    
}
