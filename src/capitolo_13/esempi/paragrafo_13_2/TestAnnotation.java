package capitolo_13.esempi.paragrafo_13_2;
public class TestAnnotation {
  @SuppressWarnings( {
    "deprecated"
  } ) @Marker public static void main(String args[]) {
    SuperClasse sc = new SuperClasse();
    sc.metodo();
    
  }
  
  
  @DaCompletare(
    descrizione = "Bisogna fare qualcosa�",
    priorita = DaCompletare.Priorita.BASSA
  )

  public void m(){}
}