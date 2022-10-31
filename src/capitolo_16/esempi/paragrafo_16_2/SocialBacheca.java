package capitolo_16.esempi.paragrafo_16_2;
import java.util.function.Consumer;

public class SocialBacheca {
    public void aggiornaFilm(Film film, Consumer<Film> consumer){
        consumer.accept(film);
    }
}