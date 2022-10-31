package capitolo_07.esempi.paragrafo_7_6;
public class Triangolo extends Poligono {
    public static final int NUMERO_LATI = 3;


    public Triangolo () {
        super(NUMERO_LATI);
    }

    public Triangolo (int lunghezzaLatoUno, int lunghezzaLatoDue, int lunghezzaLatoTre) {
        super(NUMERO_LATI, lunghezzaLatoUno, lunghezzaLatoDue, lunghezzaLatoTre);
    }
    
    public String toString(){
        return "Il triangolo ha " + super.toString();
    }
}