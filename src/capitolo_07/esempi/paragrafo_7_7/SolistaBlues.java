package capitolo_07.esempi.paragrafo_7_7;
public interface SolistaBlues extends Solista {
    default void eseguiAssolo() {
      //Scala blues in DO
        System.out.println("DO MIb FA SOLb SOL SIb DO");
    }
}