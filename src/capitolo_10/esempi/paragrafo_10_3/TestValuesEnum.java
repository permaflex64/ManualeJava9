package capitolo_10.esempi.paragrafo_10_3;
public class TestValuesEnum {
    public static void main(String args[]) {
        for (MiaEnumerazione2 miaEnumerazione : MiaEnumerazione2.values()) {
            System.out.println(miaEnumerazione + " � in posizione "  + miaEnumerazione.ordinal());
        }
    }
}