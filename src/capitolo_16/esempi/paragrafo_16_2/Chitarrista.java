package capitolo_16.esempi.paragrafo_16_2;
import java.util.function.Supplier;

public class Chitarrista {
    public void suonaChitarra(Supplier<Chitarra> marcaSupplier) {
        Chitarra chitarra = marcaSupplier.get();
        chitarra.suona();
    }
 }