import java.time.LocalDateTime;

public class Human {
    private String sex;
    private String name;

    public Human(String sex, String name) {
        this.sex = sex;
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void birthday(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("new human created @ "+now);
    }

    public void move(){
        System.out.println("move method started");
    }
}
