package capitolo_16.esempi.paragrafo_16_2;
public class FabbricaChitarraImpl  implements FabbricaChitarra {
    @Override
    public Chitarra getChitarra(String marca){
        return new Chitarra(marca);
    }
}