package capitolo_16.esempi.paragrafo_16_1;
import java.util.concurrent.*;

@FunctionalInterface
interface MyCallable extends Callable<Void> {
    @Override
    Void call() throws InterruptedException;
}
