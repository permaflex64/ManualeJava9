package capitolo_13.esempi.paragrafo_13_3;
@FunctionalInterface
public interface FunctionalInterfaceExample {
    int metodoAstratto();
//    void secondoMetodoAstratto();
    default void metodoDiDefault(){
        System.out.println("metodo di default");
    }
}