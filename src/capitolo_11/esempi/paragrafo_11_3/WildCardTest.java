package capitolo_11.esempi.paragrafo_11_3;
import java.util.*;

public class WildCardTest {
    void test(List<?> list) {
        testHelper(list);
    }
    //Metodo helper
    private <T> void testHelper (List<T> list) {
        list.set(0, list.get(0));
    }
}