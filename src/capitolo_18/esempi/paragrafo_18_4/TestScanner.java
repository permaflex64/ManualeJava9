package capitolo_18.esempi.paragrafo_18_4;
import java.util.*;

public class TestScanner {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String testoDigitato ="";
            while (sc.hasNext()) {
                testoDigitato = sc.nextLine();
                System.out.println(testoDigitato);
            }
        }
    }
}