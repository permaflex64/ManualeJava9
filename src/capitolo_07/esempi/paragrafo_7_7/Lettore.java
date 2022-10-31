package capitolo_07.esempi.paragrafo_7_7;
public interface Lettore {
    default void leggi(Libro libro) {
        System.out.println("Sto leggendo: " + libro.getTitolo() + " di " + libro.getAutore());
    }
}