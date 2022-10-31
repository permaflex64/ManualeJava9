package capitolo_13.esempi.paragrafo_13_2;
import java.lang.reflect.*;
import java.util.*;
import java.lang.annotation.*;

public class AnnotationsReflection2 {
    public static void main(String[] args) throws Exception {
//        Method m = Test.class.getMethod("doSomething");
        Annotation[] dcs = SottoClasse.class.getAnnotations();
        for (Annotation dc : dcs) {
            System.out.println(dc);
        }
    }
}