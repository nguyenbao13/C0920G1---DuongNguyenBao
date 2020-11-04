import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String>	linkedList	=	new	LinkedList<>();
        linkedList.add("New	York");
        linkedList.add("Atlanta");
        linkedList.add("Dallas");
        linkedList.add("Madison");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "  ");
        }
    }
}
