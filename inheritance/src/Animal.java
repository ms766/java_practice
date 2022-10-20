public class Animal {

    //state
    private String name;
    private int brain;
    private int body;
    private int weight;

    public Animal(String name, int brain, int body, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("animal eating");
    }

    public void move(int speed){
        System.out.println("anminal moving @ "+speed);
    }


    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }
}
