public class Main {
    public static void main(String[] args) {
//    Printer printer = new Printer(50,true);
        Printer printer = new Printer(50,false);
        System.out.println("initial page count = "+ printer.getPagePrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was " + pagesPrinted +" new total print count for printer = " + printer.getPagePrinted());
    }
}