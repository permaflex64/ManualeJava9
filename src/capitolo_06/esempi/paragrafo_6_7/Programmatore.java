package capitolo_06.esempi.paragrafo_6_7;
public class Programmatore extends Dipendente {
    private String[] certificazioni;

    public Programmatore(int matricola, int annoDiAssunzione) {
        setMatricola(matricola);
        setAnnoDiAssunzione(annoDiAssunzione);
    }
    public void setCertificazioni(String[] certificazioni) {
        this.certificazioni = certificazioni;
    }

    public String[] getCertificazioni() {
        return certificazioni;
    }
}