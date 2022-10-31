package capitolo_13.esempi.paragrafo_13_2;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
@Inherited
@Target(value=METHOD)
@Retention(value=RetentionPolicy.SOURCE)
public @interface Marker {
}