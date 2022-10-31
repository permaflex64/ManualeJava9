package capitolo_07.esempi.paragrafo_7_5.paragrafo_7_5_3;
public class Cliente extends Persona {
    private String indirizzo, telefono;
    public String toString(){
        return super.toString()+ "\n"+ 
        indirizzo + "\nTel:" + telefono;
    }
    //accessor e mutator methods (set e get)
}