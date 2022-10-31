package capitolo_09.esempi.paragrafo_9_5;
public class GestorePrenotazioni {
    public static void main(String [] args) {
        Botteghino botteghino = new Botteghino();
        try {
            for (int i = 1; i <= 101; ++i) {
                botteghino.prenota();
                System.out.println("Prenotato posto n� " + i);
            }
        }
        catch (PrenotazioneException exc) {
            System.out.println(exc.toString());
        }
    }
}