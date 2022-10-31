package capitolo_16.esempi.paragrafo_16_1;
import java.util.concurrent.*;

public class TestWithoutMyCallable {
    public static void main(String args[]) {
        Callable<Void> callable = ()-> {
            Thread.sleep(1000);
            System.out.println("Hello World");
            return null;
        } ;

    }
}