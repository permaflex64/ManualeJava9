package capitolo_09.esempi.paragrafo_9_6;
public class AssertsEnabled {
    static {
        boolean assertsEnabled = false;
        assert assertsEnabled = true;
        if (!assertsEnabled)
        throw new RuntimeException("Asserts must be " +
        "enabled! ");
    }
}