package capitolo_17.esempi.paragrafo_17_8;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class CSDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List strings = IntStream.rangeClosed(1, 10_000_000)
          .mapToObj(Integer::toString).collect(toList());
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Generated " + strings.size() + " strings in " 
          + totalTime + " ms.");

        startTime = System.currentTimeMillis();
        String appended = (String) strings.stream().limit(100_000)
          .reduce("", (left, right) -> left.toString() + right.toString());
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Created string of length " + appended.length() 
          + " in " + totalTime + " ms.");
    }
}