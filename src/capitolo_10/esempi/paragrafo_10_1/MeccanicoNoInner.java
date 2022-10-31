package capitolo_10.esempi.paragrafo_10_1;
public class MeccanicoNoInner {
    private AutoNoInner auto;
    public MeccanicoNoInner (AutoNoInner auto){
        this.auto = auto;
    }
    public void aggiustaMotore() {
        auto.setStatoMotore ("buono");
    }
}