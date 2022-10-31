package capitolo_13.esempi.paragrafo_13_1;
import java.lang.reflect.*;
import java.util.*;
import java.lang.annotation.*;

public class AnnotationsReflection {
    public static void main(String[] args) throws Exception {
        Method m = Test.class.getMethod("faQualcosa");
        Annotation[] dcs = m.getAnnotations();
        for (Annotation dc : dcs) {
            System.out.println(dc);
        }
    }
}