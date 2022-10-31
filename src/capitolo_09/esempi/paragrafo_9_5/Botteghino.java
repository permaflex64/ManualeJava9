package capitolo_09.esempi.paragrafo_9_5;
public class Botteghino {
    private int postiDisponibili;
    public Botteghino() {
        postiDisponibili = 100;
    }
    public void prenota() throws PrenotazioneException {
        try {
            //controllo sulla disponibilit� dei posti
            if (postiDisponibili == 0) {
                //lancio dell�eccezione
                throw new PrenotazioneException();
            }
            //metodo che realizza la prenotazione
            // se non viene lanciata l�eccezione
            postiDisponibili--;
        }
        catch (PrenotazioneException exc) {
            System.out.println(exc.toString());
        }
    }
}