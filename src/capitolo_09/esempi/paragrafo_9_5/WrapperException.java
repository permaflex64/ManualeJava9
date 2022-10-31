package capitolo_09.esempi.paragrafo_9_5;
public class WrapperException {
    private Exception altraEccezione;
    public WrapperException(Exception altraEccezione) {
        this.setAltraEccezione(altraEccezione);
    }
    public void setAltraEccezione(Exception altraEccezione) {
        this.altraEccezione = altraEccezione;
    }
    public Exception getAltraEccezione() {
        return altraEccezione;
    }
    //...
}