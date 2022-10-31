package capitolo_07.esempi.paragrafo_7_7;
public interface Programmatore {
    default void programma(String linguaggio) {
        System.out.println("Sto programmando in " + linguaggio);
    }
}
