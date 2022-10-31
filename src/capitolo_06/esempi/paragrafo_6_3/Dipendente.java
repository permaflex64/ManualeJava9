package capitolo_06.esempi.paragrafo_6_3;
public class Dipendente {
    private String nome;
    private int anni; //intendiamo et� in anni
//    . . .
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        nome = n;
    }
    public int getAnni() {
        return anni;
    }
    public void setAnni(int n) {
        anni = n;
    }
    public int getDifferenzaAnni(Dipendente altro) {
        return (getAnni() - altro.anni);
    }
}