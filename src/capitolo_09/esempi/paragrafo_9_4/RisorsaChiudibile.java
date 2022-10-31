package capitolo_09.esempi.paragrafo_9_4;
public class RisorsaChiudibile implements AutoCloseable {
    public void close() {
        System.out.println("Chiamato metodo close()");
    }

    public String toString() {
        return "RisorsaChiudibile";
    }
}