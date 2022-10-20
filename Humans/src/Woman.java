public class Woman extends Man{
   private boolean breast;

    public Woman(String sex, String name, boolean beard, boolean child, boolean breast) {
        super(sex, name, beard, child);
        this.breast = breast;
    }

    public boolean isBreast() {
        return breast;
    }

    @Override
    public void move() {
        System.out.println("-------");
        System.out.println("  ");
        super.move();
        System.out.println("woman walks");
    }
}
