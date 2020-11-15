package s15_io_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class ReadCsvFile {
    public static void main(String[] args) {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/s15_io_text_file/bai_tap/doc_file_csv/file.csv"));
            while((line = br.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println("Country[code = " + country[4] + ", name = " + country[5] + "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
