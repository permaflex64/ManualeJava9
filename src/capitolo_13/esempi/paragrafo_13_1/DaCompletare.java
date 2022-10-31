package capitolo_13.esempi.paragrafo_13_1;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DaCompletare {
    String descrizione();
    String assegnataA() default "da assegnare";
    enum Priorita {ALTA, MEDIA, BASSA};
    Priorita priorita() default Priorita.ALTA;
//    public static final int a = 0;
//    public static final class Pluto {}
}

