package case_study_furama_resort.commons;

import case_study_furama_resort.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    //Viết vào file bất kỳ
    public static void writeFile(String pathFile, Object o) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(o.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Đọc file bất kỳ
    public static List<String> readFile(String pathFile) {
        List<String> listLine = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  listLine;
    }
    //Đọc file Villa
    public static List<Villa> readFileVilla(String pathFile) {
        List<Villa> listLine = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line;
            String[] strings;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(", ");
                villa = new Villa(strings[0],strings[1],Double.parseDouble(strings[2]),
                        Double.parseDouble(strings[3]),Integer.parseInt(strings[4]), strings[5],
                        strings[6],strings[7],Double.parseDouble(strings[8]),Integer.parseInt(strings[9]));
                listLine.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
    //Đọc file nhị phân
    public static void writeBinaryFile(String pathFile, Object object) {
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream(new File(pathFile)));
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
