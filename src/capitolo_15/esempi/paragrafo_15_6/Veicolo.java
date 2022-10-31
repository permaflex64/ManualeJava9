package capitolo_15.esempi.paragrafo_15_6;
import java.util.concurrent.Semaphore;

public  class Veicolo implements Runnable {
    private Incrocio incrocio;
    public Veicolo(Incrocio incrocio) {
        this.incrocio = incrocio;
    }

    public void run() {
        incrocio.rispettaSemaforo();
    }
}