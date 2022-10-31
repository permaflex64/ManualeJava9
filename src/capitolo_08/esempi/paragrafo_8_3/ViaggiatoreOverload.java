package capitolo_08.esempi.paragrafo_8_3;
public class ViaggiatoreOverload {
    public void viaggia(Automobile a) {
        a.accelera();
        //. . .
    }
    public void viaggia(Aereo a) {
        a.accelera();
        //. . .
    }
    public void viaggia(Nave n) {
        n.accelera();
        //. . .
    }
    //. . .
}
