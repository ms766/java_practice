public class Man extends Human{
    private boolean beard;
    private boolean child;

    public Man(String sex, String name, boolean beard, boolean child) {
        super(sex, name);
        this.beard = beard;
        this.child = child;
    }

    public boolean isBeard() {
        return beard;
    }

    public boolean isChild() {
        return child;
    }

   public void childCheck(){
        if (this.child == true){
            birthday();
        }
   }

    @Override
    public void move() {
        super.move();
        System.out.println("man runs");
    }
}
