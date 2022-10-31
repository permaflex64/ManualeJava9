package capitolo_10.esempi.paragrafo_10_3;
public enum MiaEnumerazione2 implements Numeratore {
    UNO, DUE, TRE;
    @Override
    public void stampaIndice() {
            System.out.println("Indice: " + this.ordinal());
    }
}