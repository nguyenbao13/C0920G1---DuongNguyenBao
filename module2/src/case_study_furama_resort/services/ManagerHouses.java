package case_study_furama_resort.services;

import case_study_furama_resort.models.House;
import case_study_furama_resort.models.Villa;

import java.util.ArrayList;
import java.util.List;

import static case_study_furama_resort.commons.FileUtils.readFile;

public class ManagerHouses {
    public static void showHouse() {
        List<String> houseList = readFile("src/case_study_furama_resort/data/House");
        int i = 1;
        for(String house : houseList) {
            System.out.println(i + ". " + house);
            i++;
        }
    }
    public static List<House> getAllHouse() {
        List<String> houseList = readFile("src/case_study_furama_resort/data/House");
        List<House> list = new ArrayList<>();
        String[] strings;
        House house;
        for(int i = 0; i < houseList.size(); i++) {
            strings = houseList.get(i).split(", ");
            house = new House(strings[0], strings[1], Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Integer.parseInt(strings[4]),
                    strings[5], strings[6], strings[7], Integer.parseInt(strings[8]));
            list.add(house);
        }
        return list;
    }
}
