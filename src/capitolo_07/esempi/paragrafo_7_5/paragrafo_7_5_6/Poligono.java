package capitolo_07.esempi.paragrafo_7_5.paragrafo_7_5_6;
public abstract class Poligono {
    private int numeroLati;
    private int lunghezzaLatoUno;
    private int lunghezzaLatoDue;
    private int lunghezzaLatoTre;

    public  Poligono(int numeroLati) {
        setNumeroLati(numeroLati);
    }

    public  Poligono(int numeroLati, int lunghezzaLatoUno, int lunghezzaLatoDue, int lunghezzaLatoTre) {
        setNumeroLati(numeroLati);
        setLunghezzaLatoUno(lunghezzaLatoUno);
        setLunghezzaLatoDue(lunghezzaLatoDue);
        setLunghezzaLatoTre(lunghezzaLatoTre);
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public int getNumeroLati() {
        return numeroLati;
    }
    public void setLunghezzaLatoTre(int lunghezzaLatoTre) {
        this.lunghezzaLatoTre = lunghezzaLatoTre;
    }

    public int getLunghezzaLatoTre() {
        return lunghezzaLatoTre;
    }


    public void setLunghezzaLatoDue(int lunghezzaLatoDue) {
        this.lunghezzaLatoDue = lunghezzaLatoDue;
    }

    public int getLunghezzaLatoDue() {
        return lunghezzaLatoDue;
    }


    public void setLunghezzaLatoUno(int lunghezzaLatoUno) {
        this.lunghezzaLatoUno = lunghezzaLatoUno;
    }

    public int getLunghezzaLatoUno() {
        return lunghezzaLatoUno;
    }
    
    public String toString(){
        return numeroLati + " lati: lunghezza lato uno = " + lunghezzaLatoUno + ", lunghezza lato due = " + lunghezzaLatoDue + ", lunghezza lato tre = " + lunghezzaLatoTre;
    }

}
