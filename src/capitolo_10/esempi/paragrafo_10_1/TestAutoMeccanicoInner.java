package capitolo_10.esempi.paragrafo_10_1;
public class TestAutoMeccanicoInner {
    public static void main(String args[]) {
        Auto auto = new Auto();
        Auto.Meccanico meccanico = auto.new Meccanico();
    }
}