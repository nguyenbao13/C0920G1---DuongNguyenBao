package case_study_furama_resort.services;

import case_study_furama_resort.models.Room;
import case_study_furama_resort.models.Villa;

import java.util.ArrayList;
import java.util.List;

import static case_study_furama_resort.commons.FileUtils.readFile;

public class ManagerRooms {
    public static void showRoom() {
        List<String> roomList = readFile("src/case_study_furama_resort/data/Room");
        int i = 1;
        for(String room : roomList) {
            System.out.println(i + ". " + room);
            i++;
        }
    }
    public static List<Room> getAllRoom() {
        List<String> roomList = readFile("src/case_study_furama_resort/data/Room");
        List<Room> list = new ArrayList<>();
        String[] strings;
        Room room;
        for(int i = 0; i < roomList.size(); i++) {
            strings = roomList.get(i).split(", ");
            room = new Room(strings[0], strings[1], Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Integer.parseInt(strings[4]),
                    strings[5], strings[6]);
            list.add(room);
        }
        return list;
    }
}
