package capitolo_11.esempi.paragrafo_11_2;
import java.util.*;

public class TestWildCardError {
    public void printList(List<Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

/* public void print(Collection <Object> al) { CON PRINT FUNZIONA TUTTO
        Iterator<Object> i = al.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            System.out.println(o);
        }
    }
 */

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Unbounded Wildcard");
        list.add("Upper Bounded Wildcard");
        list.add("Lower BoundedWildcard");
        TestWildCard twd = new TestWildCard();
        //twd.printList(list);
//        twd.printCollection(new ArrayList<Object>());
//        twd.printCollection(list);
//        twd.sum(new ArrayList<Integer>());

    }
}