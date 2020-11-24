package case_study_furama_resort.services;

import case_study_furama_resort.models.Villa;
import java.util.ArrayList;
import java.util.List;

import static case_study_furama_resort.commons.FileUtils.readFile;

public class ManagerVillas {
    public static void showVilla() {
        List<String> villaList = readFile("src/case_study_furama_resort/data/Villa");
        int i = 1;
        for(String villa : villaList) {
            System.out.println(i + ". " + villa);
            i++;
        }
    }
    public static List<Villa> getAllVilla() {
        List<String> villaList = readFile("src/case_study_furama_resort/data/Villa");
        List<Villa> list = new ArrayList<>();
        String[] strings;
        Villa villa;
        for(int i = 0; i < villaList.size(); i++) {
                strings = villaList.get(i).split(", ");
                villa = new Villa(strings[0], strings[1], Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Integer.parseInt(strings[4]),
                        strings[5], strings[6], strings[7], Double.parseDouble(strings[8]), Integer.parseInt(strings[9]));
                list.add(villa);
        }
        return list;
    }
}
