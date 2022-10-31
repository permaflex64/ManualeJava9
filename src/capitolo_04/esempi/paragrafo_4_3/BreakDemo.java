package capitolo_04.esempi.paragrafo_4_3;
public class BreakDemo {
    public static void main(String args[]) {
        int i = 0;
        while (true) { //ciclo infinito 
            if (i > 10)
            break;
            System.out.println(i);
            i++;
        }
    }
}