package capitolo_07.esempi.paragrafo_7_5.paragrafo_7_5_4;

//import com.cdsc.test.*;

public class ProtectedSottoclasseFuoriPackage extends ProtectedInClasse {
    public void metodoCheUsaProtected() {
        metodoProtected();
        System.out.println(variabileProtected);
    }
}
