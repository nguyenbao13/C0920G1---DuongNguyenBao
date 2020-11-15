package s15_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyTextFile {
    public static void main(String[] args) {
        String line;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/s15_io_text_file/bai_tap/doc_file_csv/file.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/s15_io_text_file/bai_tap/copy_file_text/copiedFile.csv"));
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
