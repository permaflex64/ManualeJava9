package capitolo_07.esempi.paragrafo_7_7;
public class Chitarrista implements SolistaBlues, SolistaRock {
    public void eseguiAssolo() {
       //Scala pentatonica + scala blues in DO
        SolistaRock.super.eseguiAssolo();
        SolistaBlues.super.eseguiAssolo();
    }
}