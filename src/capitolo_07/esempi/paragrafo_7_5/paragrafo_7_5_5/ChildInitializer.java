package capitolo_07.esempi.paragrafo_7_5.paragrafo_7_5_5;
public class ChildInitializer extends ParentInitializer {
    public ChildInitializer (){
        System.out.println("Costruttore di ChildInitializer");
    }
    {
        System.out.println("Inizializzatore d'istanza di ChildInitializer");
    }

    static {
        System.out.println("Inizializzatore statico di ChildInitializer");
    }
    public static void main(String args[]) {
        new ChildInitializer();
    }
}
