package capitolo_07.esempi.paragrafo_7_5.paragrafo_7_5_4;

public class ProtectedSottoclasseInPackage extends ProtectedInClasse {
    public void metodoCheUsaProtected() {
        metodoProtected();
        System.out.println(variabileProtected);
    }
}
