package capitolo_10.esempi.paragrafo_10_2;
public class Outer3 {
    private String messaggio ="Nella classe ";
    private void stampaMessaggio() {
        System.out.println(messaggio+"Esterna");
    }
    //Definizione della classe anonima e sua istanza
    ClasseEsistente ca = new ClasseEsistente() {
        @Override
        public void metodo() {
            System.out.println(messaggio+"anonima");
        }
    }; //Notare il ";"
    //. . .
}