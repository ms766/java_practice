public class Vehicle {

    private String name;
    private String size;
    private int currentVel;
    private int currentDir;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVel = 0;
        this.currentDir = 0;
    }

    public void steer(int direction){
        this.currentDir += direction;
        System.out.println("Vehicle.steer(): Steering at" + this.currentDir + "degrees");
    }

    public void move(int velocity,int direction){
        this.currentVel = velocity;
        this.currentDir = direction;
        System.out.println("Vehicle.move(): Moving at" + this.currentVel + "in direction"+this.currentDir);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVel() {
        return currentVel;
    }

    public int getCurrentDir() {
        return currentDir;
    }
}
