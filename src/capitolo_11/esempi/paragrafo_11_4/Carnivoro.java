package capitolo_11.esempi.paragrafo_11_4;
public class Carnivoro<E extends Erbivoro> implements Animale<E> {
    public void mangia(E erbivoro) {
        //un carnivoro potrebbe mangiare erbivori
    }
}