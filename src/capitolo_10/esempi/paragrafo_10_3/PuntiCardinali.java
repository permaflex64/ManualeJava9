package capitolo_10.esempi.paragrafo_10_3;
public enum PuntiCardinali {
    NORD {
        @Override
        public void test() {
            System.out.println("metodo di NORD");
        }
    } ,
    SUD, OVEST, EST;
    public void test() {
        System.out.println("metodo dell�enum");
    }
}