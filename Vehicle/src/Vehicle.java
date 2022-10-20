public class Vehicle {
    private String name;
    private String size;
    private int curVel;
    private int curDir;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.curDir = 0;
        this.curVel = 0;
    }

    public void steer(int dir){
        this.curDir += dir;
        System.out.println(this.curDir);
    }

    public void move(int vel,int dir){
        this.curVel = vel;
        this.curDir = dir;
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurVel() {
        return curVel;
    }

    public int getCurDir() {
        return curDir;
    }
}
