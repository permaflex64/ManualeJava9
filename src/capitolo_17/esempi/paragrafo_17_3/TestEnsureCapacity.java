package capitolo_17.esempi.paragrafo_17_3;
import java.util.*;

public class TestEnsureCapacity {
    public static void main(String args[]) {
        //capacit� iniziale 1
        ArrayList<String> list = new ArrayList<>(1);
        long startTime = System.currentTimeMillis();
        //list.ensureCapacity(100000000);
        for (int i = 0; i < 100000000; i++) {
            list.add("nuovo elemento");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo = "+ (endTime - startTime));
    }
}