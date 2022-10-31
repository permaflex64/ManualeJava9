package capitolo_13.esempi.paragrafo_13_1;
public class Test {
    @DaCompletare(
    descrizione ="Bisogna fare qualcosa�",
    assegnataA ="Claudio"
    )
    enum Alfabeto {
        A,B,C
    } ;
    public @interface Serie {
        alfabeto value();
        enum alfabeto {
            A,B,C
        } ;
    }

    @SingleValue(value = SingleValue.pippo.A)
    @DaCompletare(
    descrizione ="Bisogna fare qualcosa...",
    assegnataA ="Claudio"
    )
    public Enum<Alfabeto> faQualcosa() {
        System.out.println("far� qualcosa...");

        return Alfabeto.A;
    }
}