package capitolo_11.esempi.paragrafo_11_1;
public class TestContenitore {
    public static void main(String args[]) {
        Contenitore contenitore = new Contenitore();
        contenitore.setObject("Stringa");
        String object = (String)contenitore.getObject();
        System.out.println(object);
    }
}