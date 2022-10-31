package capitolo_10.esempi.paragrafo_10_1;
public class OuterProp5 {
    private String stringaOuter = "JAVA";
    public void metodoOuter() {
        int intMetodo = 7;
        class Inner {
            public void metodoInner() {
               // System.out.println(stringaOuter + " " + (++intMetodo));
            }
        }
    }
}

/*
Questo file non compila!

OuterProp5.java:7: error: local variables referenced from an inner class must be final or effectively final
                System.out.println(outerString+ " " + (++intMethod));
                                                         ^
1 error

*/