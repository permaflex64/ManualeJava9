package capitolo_13.esempi.paragrafo_13_1;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface Serie {
  alfabeto value();
  enum alfabeto {A,B,C};
}