package capitolo_18.esempi.paragrafo_18_5;
import java.time.temporal.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
import java.time.*;

public class FilesFind {
    public static void main (String args[]) throws IOException {
        Path directory = Paths.get(".");
        Instant ultimaMezzora = Instant.now().minus(30, ChronoUnit.MINUTES);
        try (Stream<Path> files = Files.find(directory, 1,
                (path, attributi) -> attributi.creationTime().toInstant().compareTo(ultimaMezzora) >= 0)) {
            files.forEach(System.out::println);
        }
    }
}