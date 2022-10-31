package capitolo_07.esempi.paragrafo_7_7;
public interface SolistaRock extends Solista {
    default void eseguiAssolo() {
      //Scala pentatonica in DO
        System.out.println("DO RE MI SOL LA DO");
    }
}