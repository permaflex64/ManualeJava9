package capitolo_02.esempi.paragrafo_2_7;
public class ClasseEsterna {
    private int i = 0;
    class ClasseInterna {
        public void metodo(){
            System.out.println("Posso accedere alla variabile i " + i);
        }
    }
}
