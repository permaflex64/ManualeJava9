package capitolo_13.esempi.paragrafo_13_2;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
@Target({TYPE, METHOD, CONSTRUCTOR, PACKAGE, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DaCompletare {
    String descrizione();
    String assegnataA() default "da assegnare";
    enum Priorita {ALTA, MEDIA, BASSA};
    Priorita priorita() default Priorita.ALTA;
}