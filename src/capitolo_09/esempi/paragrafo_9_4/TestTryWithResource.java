package capitolo_09.esempi.paragrafo_9_4;
public class TestTryWithResource {
    public static void main(String args[]) {
        try (RisorsaChiudibile risorsaChiudibile = new RisorsaChiudibile()) {
            System.out.println("Sto per chiudere: "+ risorsaChiudibile);
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}