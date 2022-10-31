package capitolo_10.esempi.paragrafo_10_1;
public class Outer {
    private String messaggio = "Nella classe ";
    private void stampaMessaggio() {
        System.out.println(messaggio + "Esterna");
    }
    /* la classe interna accede in maniera naturale ai membri
    della classe che la contiene */
    public class Inner {
        // classe interna
        public void metodo() {
            System.out.println(messaggio + "Interna");
        }
        public void chiamaMetodo() {
            stampaMessaggio();
        }
        //. . .
    }
    //. . .
}