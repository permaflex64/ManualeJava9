package capitolo_11.esempi.paragrafo_11_4;
public class Erbivoro<E extends Erba> implements Cibo, Animale<E> {
    public void mangia(E erba) {
        //un erbivoro mangia erba
    }

    public String getColore() {
        //. . .
        return null;
    }
}