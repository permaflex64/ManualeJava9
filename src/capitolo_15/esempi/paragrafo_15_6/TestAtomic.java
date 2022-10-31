package capitolo_15.esempi.paragrafo_15_6;
import java.util.concurrent.atomic.*;

public class TestAtomic {
    public static void main(String args[]) {
        AtomicLong atomicLong = new AtomicLong(10);
        long incrementedLong =  atomicLong.incrementAndGet();
        System.out.println(incrementedLong);
    }
}