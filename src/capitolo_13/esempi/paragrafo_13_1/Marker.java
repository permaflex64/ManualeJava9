package capitolo_13.esempi.paragrafo_13_1;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
@Inherited
@Target(value=METHOD)
@Retention(value=RetentionPolicy.SOURCE)
public @interface Marker {
}