package capitolo_12.esempi.paragrafo_12_6;
public class TestComplexAutoBoxing {
    public static void main(String args[]) {
        Integer i = new Integer(22);
        int j = i++;
        Integer k = (new Integer(10) + j);
        int t = k + j + i;
        System.out.println(t);
    }
}