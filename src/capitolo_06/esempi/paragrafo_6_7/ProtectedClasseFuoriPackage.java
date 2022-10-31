package capitolo_06.esempi.paragrafo_6_7;

//import com.cdsc.test.*;

public class ProtectedClasseFuoriPackage {
    public void metodoCheUsaProtected() {
        ProtectedInClasse protectedInClasse = new ProtectedInClasse();
        protectedInClasse.metodoProtected();
        System.out.println(protectedInClasse.variabileProtected);
    }
}
