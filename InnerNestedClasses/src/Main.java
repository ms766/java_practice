public class Main {
    public static void main(String[] args) {
        //4 types of nest classes
        //static class
        //non-static class -> inner class
        //local class -> inner class that's defined inside a scope block
        //anonymous class -> nest class without a name

        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        System.out.println(first.driveSpeed(1000));
    }
}