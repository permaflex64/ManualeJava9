package capitolo_11.esempi.paragrafo_11_3;
public class TestOwnGenericWithMinus {
    public static void main(String args[]) {
        OwnGeneric<String> own = new OwnGeneric<>();
        own.add("-");
        own.add("--");
        own.add("---");
        System.out.println(own);
    }
}