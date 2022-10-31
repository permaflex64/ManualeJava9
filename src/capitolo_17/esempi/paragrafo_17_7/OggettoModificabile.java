package capitolo_17.esempi.paragrafo_17_7;
public class OggettoModificabile {
    private String nome;
    public OggettoModificabile (String nome){
        this.nome = nome;
    }

    public void setTitolo(String nome) {
        this.nome = nome;
    }

    public String getTitolo() {
        return nome;
    }

    public String toString() {
        return nome;
    }
}