package contact_manager.commons;

import contact_manager.models.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    //Viết mới từng dòng vào file
    public static void writeFile(String pathFile, Object object) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile, true));
            bufferedWriter.write(object.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Viết mới từng dòng vào file cho Person
    public static void writeContactFile(String pathFile, Person person) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile, true));
            bufferedWriter.write(person.showInformation());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Viết lại các dòng vào file sau khi đã cập nhật
    public static void overWriteFile(String pathFile, List list) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Object object : list) {
                bufferedWriter.write(object.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //overWriteFile cho Person
    public static void overWriteContactFile(String pathFile, List<Person> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile, false));
            for(Person person : list) {
                bufferedWriter.write(person.showInformation());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Đọc file Person
    public static List<Person> readFile(String pathFile) {
        List<Person> personList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String[] strings;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(", ");
                Person person = new Person(Integer.parseInt(strings[0]),strings[1],strings[2],strings[3],strings[4],strings[5]);
                personList.add(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }
    //Ghi file có id tự tăng
    public static void writeFileAutoId(String pathFile, Person person) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            if(bufferedReader.readLine() == null) {
                person.setId(1);
            } else {
                person.setId(readFile(pathFile).get(readFile(pathFile).size()-1).getId() + 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeContactFile(pathFile, person);
    }
}
