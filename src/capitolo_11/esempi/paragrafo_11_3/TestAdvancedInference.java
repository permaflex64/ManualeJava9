package capitolo_11.esempi.paragrafo_11_3;
public class TestAdvancedInference {
    public static void main(String args[]) {
        AdvancedInference<Boolean> test1= new AdvancedInference<Boolean>("");
        AdvancedInference<Boolean> test2 = new AdvancedInference<>("");
        AdvancedInference<Boolean> test3 = new <String> AdvancedInference<Boolean>("");
    }
}