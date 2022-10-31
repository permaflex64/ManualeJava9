package capitolo_13.esempi.paragrafo_13_1;
public class Persona {
    //...
    private int anni;
    public void setAnni(int anni) {
        if (anni < 0)
            throw new IllegalArgumentException(anni 
              + " anni, non � una et� valida!");
        this.anni = anni;        
    }
    public int getAnni() {
        return anni;
    }
}
