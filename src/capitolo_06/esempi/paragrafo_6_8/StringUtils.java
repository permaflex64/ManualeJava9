package capitolo_06.esempi.paragrafo_6_8;
public class StringUtils {
    public static int contaOccorrenze(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
//Potremmo aggiungere altri metodi che fanno operazioni sulle stringhe
}
