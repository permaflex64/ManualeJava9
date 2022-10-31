package capitolo_15.esempi.paragrafo_15_6;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Festa implements Runnable {
    private CyclicBarrier luogoDellaFesta;

    public Festa(CyclicBarrier luogoDellaFesta) {
        this.luogoDellaFesta = luogoDellaFesta;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " � presente");
            luogoDellaFesta.await();
            System.out.println(Thread.currentThread().getName() + " ha iniziato a festeggiare...");
        } catch (InterruptedException | BrokenBarrierException ex) {
            ex.printStackTrace();
        }
    }
}