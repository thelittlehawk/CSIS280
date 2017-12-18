package ba.edu.ssst.invoices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Invoice> invoices = new ArrayList<>();

        try {
            Path inFilePath = Paths.get("src/invoices.csv");
            Stream<String> lines = Files.lines
                    (inFilePath);


            lines.forEach((String s) -> {
                String[] rawLine = s.split(",");

                String name = rawLine[0];
                Double value = Double.parseDouble(rawLine[1]);

                Invoice invoice = new Invoice(name, value);

                invoices.add(invoice);
            });

            System.out.println(" = DONE = ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
