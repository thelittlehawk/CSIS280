package ba.edu.ssst.fileio;

import javax.swing.text.DateFormatter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println("File input output");

	    // "src/numbers.txt"
        // "../FileInOut/src/numbers.txt"
        try {
            ArrayList<Integer> numbers = new ArrayList<Integer>();

            List<String> linesFromFile = Files.readAllLines(Paths.get("src/numbers.txt"));
            linesFromFile.forEach((String line) -> {
                try {
                    Integer tempInt = Integer.parseInt(line);
                    numbers.add(tempInt);
                } catch (NumberFormatException ex) {
                    System.out.println("Can't process " + line);
                }
            });



            ArrayList<String> outputNumbers = new ArrayList<>();
            numbers.forEach((Integer number) -> {
                outputNumbers.add(number.toString());
            });


            Files.write(Paths.get("src/outfile.txt"), outputNumbers, Charset.defaultCharset());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
