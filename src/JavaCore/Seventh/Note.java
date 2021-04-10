package JavaCore.Seventh;

import JavaCore.Sixth.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Integer.parseInt("42");
        try (var in = new Scanner(new FileInputStream("src/alice.txt"), StandardCharsets.UTF_8);
            var out = new PrintWriter("out.txt", StandardCharsets.UTF_8))
        {
            while(in.hasNext())
                out.println(in.next().toUpperCase(Locale.ROOT));
        }
    }
}
