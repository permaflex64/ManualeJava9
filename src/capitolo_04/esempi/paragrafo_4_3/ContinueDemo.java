package capitolo_04.esempi.paragrafo_4_3;
public class ContinueDemo {
    public static void main(String args[]) {
        int i = 0;
        do {
            i++;
            if (i == 5)
            continue;
            System.out.println(i);
        }
        while(i <= 10);
    }
}