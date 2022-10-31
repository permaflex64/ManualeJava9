package capitolo_14.esempi.paragrafo_14_1;
import java.util.*;

public class TestProperties {
    public static void main(String args[]) {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}