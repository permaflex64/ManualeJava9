package capitolo_04.esempi.paragrafo_4_1;
public class TestAlunno {
    public static void main(String args[]) {
        Alunno alunno1 = new Alunno("Simone");
        Alunno alunno2 = new Alunno("Simone");
        System.out.println(alunno1 == alunno2);
    }
}