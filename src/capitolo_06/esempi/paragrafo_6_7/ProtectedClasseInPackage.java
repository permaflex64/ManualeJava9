package capitolo_06.esempi.paragrafo_6_7;

public class ProtectedClasseInPackage {
    public void metodoCheUsaProtected() {
        ProtectedInClasse protectedInClasse = new ProtectedInClasse();
        protectedInClasse.metodoProtected();
        System.out.println(protectedInClasse.variabileProtected);
    }
}
