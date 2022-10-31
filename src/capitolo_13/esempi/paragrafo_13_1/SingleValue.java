package capitolo_13.esempi.paragrafo_13_1;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface SingleValue {
  pippo value();
  enum pippo {A,B,C};
}