package bank_manager.commons;

import bank_manager.models.Customer;
import bank_manager.models.LimitedBook;
import bank_manager.models.LongTermBook;
import bank_manager.models.UnlimitedBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<Customer> readFile(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String[] strings;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(", ");
                Customer customer = new Customer(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public static void writeLongTermFile(String pathFile, LongTermBook longTermBook) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile, true));
            bufferedWriter.write(longTermBook.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeShortTermFile1(String pathFile, UnlimitedBook unlimitedBook) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile, true));
            bufferedWriter.write(unlimitedBook.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeShortTermFile2(String pathFile, LimitedBook limitedBook) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile, true));
            bufferedWriter.write(limitedBook.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
