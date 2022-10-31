package capitolo_07.esempi.paragrafo_7_7;
public class TestEreditarietaMultipla {
    public static void main(String args[]) {
        ChiStaLeggendo tu = new ChiStaLeggendo();
        Libro java9 = new Libro("Manuale di Java 9","Claudio De Sio Cesari");
        tu.programma("Java");
        tu.leggi(java9);
    }
}