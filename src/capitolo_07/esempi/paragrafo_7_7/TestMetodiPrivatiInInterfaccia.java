package capitolo_07.esempi.paragrafo_7_7;
public interface TestMetodiPrivatiInInterfaccia {
    default void metodoDiDefault() {
        metodoPrivato();
    }
    
    private /*default*/ void metodoPrivato() {
        System.out.println("Invocato metodo privato");
    }
}
