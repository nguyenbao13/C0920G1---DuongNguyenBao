package case_study_furama_resort.controllers;

import case_study_furama_resort.commons.FileUtils;
import case_study_furama_resort.models.House;
import case_study_furama_resort.models.Room;
import case_study_furama_resort.models.Services;
import case_study_furama_resort.models.Villa;

import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {
        boolean notExit = true;
        while (notExit) {
            System.out.println("1. Add New Services.\n" +
                            "2. Show Services.\n" +
                            "3. Add New Customer.\n" +
                            "4. Show Information of Customer.\n" +
                            "5. Add New Booking.\n" +
                            "6. Show Information of Employee.\n" +
                            "7. Exit.\n" +
                            "Enter a number (1-7):");
            int chosen = Integer.parseInt(scanner.nextLine());
            switch (chosen) {
                case 1: addNewServices();
                break;
                case 2: showServices();
                break;
//            case 3: addNewCustomer();
//                    break;
//            case 4: showInformationOfCustomer();
//                    break;
//            case 5: addNewBooking();
//                    break;
//            case 6: showInformationOfEmployee();
//                    break;
                case 7: System.exit(0);
                break;
            }
        }
    }
    public static void addNewServices() {
        boolean notExit = true;
        while (notExit) {
            System.out.println("1. Add New Villa.\n" +
                            "2. Add New House.\n" +
                            "3. Add New Room.\n" +
                            "4. Back to menu.\n" +
                            "5. Exit.\n" +
                            "Enter a number (1-5):");
            int addServiceChosen = Integer.parseInt(scanner.nextLine());
            switch (addServiceChosen) {
                case 1: addNewVilla();
                break;
                case 2: addNewHouse();
                break;
                case 3: addNewRoom();
                break;
                case 4: displayMainMenu();
                break;
                case 5: System.exit(0);
                break;
            }
        }
    }
    public static Services addNewService(Services services) {
        System.out.println("Enter service's name: ");
        services.setNameService(scanner.nextLine());

        System.out.println("Enter using area: ");
        services.setUsingArea(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter cost of rent: ");
        services.setRentCost(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter max amount of people: ");
        services.setAmountMax(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter type of rent: ");
        services.setRentType(scanner.nextLine());

        System.out.println("Enter ID: ");
        services.setId(scanner.nextLine());
        return services;
    }
    public static void addNewVilla() {
        Services services = new Villa();
        Villa villa = (Villa) addNewService(services);
        //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
        System.out.println("Enter standard of room: ");
        villa.setRoomStandard(scanner.nextLine());

        System.out.println("Enter other utility: ");
        villa.setOtherUtility(scanner.nextLine());

        System.out.println("Enter area of pool: ");
        villa.setPoolArea(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter number of floor: ");
        villa.setFloors(Integer.parseInt(scanner.nextLine()));

        FileUtils.writeFile("src/case_study_furama_resort/data/Villa", villa.toString());
        System.out.println("Added new villa successfully!");
    }
    public static void addNewHouse() {
        Services services = new House();
        House house = (House) addNewService(services);
        //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
        System.out.println("Enter standard of room: ");
        house.setRoomStandard(scanner.nextLine());

        System.out.println("Enter other utility: ");
        house.setOtherUtility(scanner.nextLine());

        System.out.println("Enter number of floor: ");
        house.setFloors(Integer.parseInt(scanner.nextLine()));

        FileUtils.writeFile("src/case_study_furama_resort/data/House", house.toString());
        System.out.println("Added new house successfully!");
    }
    public static void addNewRoom() {
        Services services = new Room();
        Room room = (Room) addNewService(services);
        //Dịch vụ miễn phí đi kèm.
        System.out.println("Enter free service: ");
        room.setFreeService(scanner.nextLine());

        FileUtils.writeFile("src/case_study_furama_resort/data/Room", room.toString());
        System.out.println("Added new room successfully!");
    }
    public static void showServices() {
        boolean notExit = true;
        while (notExit) {
            System.out.println("1. Show all Villa.\n" +
                            "2. Show all House.\n" +
                            "3. Show all Room.\n" +
                            "4. Show All Name Villa Not Duplicate.\n" +
                            "5. Show All Name House Not Duplicate.\n" +
                            "6. Show All Name Name Not Duplicate.\n" +
                            "7. Back to menu.\n" +
                            "8. Exit.\n" +
                            "Enter a number (1-8):");
            int showServicesChosen = Integer.parseInt(scanner.nextLine());
            switch (showServicesChosen) {
                case 1:
//                    List<Villa> villaList = FileUtils.readFileVilla("src/case_study_furama_resort/data/Villa");
//                    for(Villa villa : villaList) {System.out.println(villa);}
                    List<String> villaList = FileUtils.readFile("src/case_study_furama_resort/data/Villa");
                    for(String villa : villaList) {
                        System.out.println(villa);
                    }
                break;
                case 2:
                    List<String> houseList = FileUtils.readFile("src/case_study_furama_resort/data/House");
                    for(String house : houseList) {
                        System.out.println(house);
                    }
                break;
                case 3:
                    List<String> roomList = FileUtils.readFile("src/case_study_furama_resort/data/Room");
                    for(String room : roomList) {
                        System.out.println(room);
                    }
                break;
                case 4:
                case 5:
                case 6:
                case 7: displayMainMenu();
                break;
                case 8: System.exit(0);
                break;
            }
        }
    }
}

