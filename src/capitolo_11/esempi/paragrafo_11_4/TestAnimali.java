package capitolo_11.esempi.paragrafo_11_4;
public class TestAnimali {
    public static void main(String[] args) {
        Animale<Erbivoro> tigre = new Carnivoro<Erbivoro>();
        Erbivoro<Erba> erbivoro = new Erbivoro<Erba>();
        Erba erba = new Erba();
        erbivoro.mangia(erba);
        tigre.mangia(erbivoro);
    }
}