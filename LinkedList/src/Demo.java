import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"syd");
        addInOrder(placesToVisit,"br");
        addInOrder(placesToVisit,"me");
        addInOrder(placesToVisit,"al");
        addInOrder(placesToVisit,"da");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Alic springs");
        addInOrder(placesToVisit,"da");
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0 ){
                //equal, do not add
                System.out.println(newCity+ " already included");
                return false;
            }else if (comparison > 0){
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison < 0){
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
