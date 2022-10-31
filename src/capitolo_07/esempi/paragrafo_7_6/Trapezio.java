package capitolo_07.esempi.paragrafo_7_6;
public class Trapezio extends Poligono {
    public static final int NUMERO_LATI = 4;
    private int lunghezzaLatoQuattro;

    public Trapezio () {
        super(NUMERO_LATI) ;
    }

    public Trapezio (int lunghezzaLatoUno, int lunghezzaLatoDue, int lunghezzaLatoTre, int lunghezzaLatoQuattro) {
        super(NUMERO_LATI, lunghezzaLatoUno, lunghezzaLatoDue, lunghezzaLatoTre);
        setLunghezzaLatoQuattro(lunghezzaLatoQuattro);
    }
    public void setLunghezzaLatoQuattro(int lunghezzaLatoQuattro) {
        this.lunghezzaLatoQuattro = lunghezzaLatoQuattro;
    }

    public int getLunghezzaLatoQuattro() {
        return lunghezzaLatoQuattro;
    }
    
    public String toString(){
        return "Il trapezio ha " + super.toString() + ", lunghezza lato quattro = " + lunghezzaLatoQuattro;
    }
}