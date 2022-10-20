import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //printDouble(items);
    }

    public static void printDouble(ArrayList<Integer> number){
        for (int i: number){
            System.out.println(i * 2);
        }
    }
}