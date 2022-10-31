package capitolo_10.esempi.paragrafo_10_3;
public class TestValueOfEnum {
    public static void main(String args[]) {
        MiaEnumerazione2 elemento = MiaEnumerazione2.valueOf("UNO");
        System.out.println(elemento);
    }
}