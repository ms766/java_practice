import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkls = new LinkedList<Integer>();
        linkls.add(20);
        linkls.add(10);
        linkls.add(20);
        linkls.add(20);

        linkls.remove(1);

        for(int i = 0; i < linkls.size();i++){
            System.out.println(linkls.get(i));
        }



    }
}