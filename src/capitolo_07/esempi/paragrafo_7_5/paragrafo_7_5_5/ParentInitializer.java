package capitolo_07.esempi.paragrafo_7_5.paragrafo_7_5_5;
public class ParentInitializer {
    public ParentInitializer () {
        System.out.println("Costruttore di ParentInitializer");
    }
    {
        System.out.println("Inizializzatore d'istanza di ParentInitializer");
    }

    static {
        System.out.println("Inizializzatore statico di ParentInitializer");
    }
}
