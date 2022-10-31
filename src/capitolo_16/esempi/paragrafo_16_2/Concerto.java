package capitolo_16.esempi.paragrafo_16_2;
import java.util.function.Supplier;
public class Concerto {
    public static void main(String args[]) {
        Chitarrista chitarrista = new Chitarrista();
        Supplier<Chitarra> chitarraSupplier = ()-> new Chitarra("Ibanez");
        chitarrista.suonaChitarra(chitarraSupplier);
    }
}