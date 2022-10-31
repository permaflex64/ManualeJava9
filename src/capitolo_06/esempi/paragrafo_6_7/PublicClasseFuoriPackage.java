package capitolo_06.esempi.paragrafo_6_7;

//import com.cdsc.test.*;

public class PublicClasseFuoriPackage {
    public void metodoCheUsaPublic() {
        PublicInClasse publicInClasse = new PublicInClasse();
        publicInClasse.metodoPublic();
        System.out.println(publicInClasse.variabilePublic);
    }
}