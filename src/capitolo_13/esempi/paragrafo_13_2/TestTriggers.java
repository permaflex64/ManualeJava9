package capitolo_13.esempi.paragrafo_13_2;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface TestTriggers {
    TestTrigger[] value();    
}