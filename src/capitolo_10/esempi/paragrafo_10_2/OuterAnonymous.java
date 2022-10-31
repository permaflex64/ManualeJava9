package capitolo_10.esempi.paragrafo_10_2;
public class OuterAnonymous {
    private String messaggio ="Nella classe ";

    //Definizione della classe anonima e sua istanza
    ClasseEsistente ce = new ClasseEsistente() {
        @Override
        public void metodo() {
            System.out.println(messaggio+"anonima");
        }

        public void metodoNonInvocabile() {
            System.out.println("Per una classe anonima non esistono reference: impossibile chiamare questo metodo!");
        }
    } ; //Notare il ";"
    //. . .
    public static void main(String args[]) {
        new OuterAnonymous();
    }

    public OuterAnonymous() {
        ce.metodo();
    }
}

//Superclasse della classe anonima
//public class ClasseEsistente {
//    public void metodo() {
//        System.out.println("Nella classe esistente");
//    }
//}
