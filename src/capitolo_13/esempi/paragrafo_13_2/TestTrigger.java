package capitolo_13.esempi.paragrafo_13_2;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
@Repeatable(TestTriggers.class)
public @interface TestTrigger {
    String quando();
    StrumentoDiTest come() default StrumentoDiTest.JUNIT;
    public enum StrumentoDiTest {
        JUNIT, GUI, JMETER, SOAPUI;
    }
}