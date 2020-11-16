package case_study_furama_resort.controllers;

import case_study_furama_resort.commons.FileUtils;
import case_study_furama_resort.models.House;
import case_study_furama_resort.models.Room;
import case_study_furama_resort.models.Services;
import case_study_furama_resort.models.Villa;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {
        boolean isExit = false;
        while (!isExit) {
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
//            case 2: showServices();
//                    break;
//            case 3: addNewCustomer();
//                    break;
//            case 4: showInformationOfCustomer();
//                    break;
//            case 5: addNewBooking();
//                    break;
//            case 6: showInformationOfEmployee();
//                    break;
                case 7: isExit = true;
                    break;
            }
        }
    }
    public static void addNewServices() {
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
            //case 2: addNewHouse();
            //    break;
            //case 3: addNewRoom();
            //    break;
            case 4: displayMainMenu();
                break;
            case 5: System.exit(0);
                break;
        }
    }
    public static void addNewVilla() {
        Services services = new Villa();
       Villa villa = (Villa) addNewService(services);

        System.out.println("Enter standard of room: ");
        villa.setRoomStandard(scanner.nextLine());

        System.out.println("Enter other utility: ");
        villa.setOtherUtility(scanner.nextLine());

        System.out.println("Enter area of pool: ");
        villa.setPoolArea(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter number of floor: ");
        villa.setFloors(Integer.parseInt(scanner.nextLine()));
        System.out.println(villa.toString());
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
//        Villa villa = new Villa();
//        House house = new House();
//        Room room = new Room();
//        //String nameService, double usingArea, double rentCost, int amountMax, String rentType,
//        //String id, String roomStandard, String otherUtility, double poolArea, int floors
//        System.out.println("Enter service's name: ");
//        villa.setNameService(scanner.nextLine());
//        System.out.println("Enter using area: ");
//        villa.setUsingArea(Double.parseDouble(scanner.nextLine()));
//        System.out.println("Enter cost of rent: ");
//        villa.setRentCost(Double.parseDouble(scanner.nextLine()));
//        System.out.println("Enter max amount of people: ");
//        villa.setAmountMax(Integer.parseInt(scanner.nextLine()));
//        System.out.println("Enter type of rent: ");
//        villa.setRentType(scanner.nextLine());
//        System.out.println("Enter ID: ");
//        villa.setId(scanner.nextLine());
//        System.out.println("Enter standard of room: ");
//        villa.setRoomStandard(scanner.nextLine());
//        System.out.println("Enter other utility: ");
//        villa.setOtherUtility(scanner.nextLine());
//        System.out.println("Enter area of pool: ");
//        villa.setPoolArea(Double.parseDouble(scanner.nextLine()));
//        System.out.println("Enter number of floor: ");
//        villa.setFloors(Integer.parseInt(scanner.nextLine()));
//        System.out.println("Add new villa successfully!");
//        FileUtils.writeFile("src/case_study_furama_resort/data/Villa", villa.toString());
        //scanner.nextLine();


        //FileUtils.setPath(fileName);

//        if (fileName.equals("villa")){
//            System.out.println("Enter standard of room: ");
//            villa.setRoomStandard(scanner.nextLine());
//
//            System.out.println("Enter other utility: ");
//            villa.setOtherUtility(scanner.nextLine());
//
//            System.out.println("Enter area of pool: ");
//            villa.setPoolArea(Double.parseDouble(scanner.nextLine()));
//
//            System.out.println("Enter number of floor: ");
//            villa.setFloors(Integer.parseInt(scanner.nextLine()));
//
//            System.out.println("Add new villa successfully!");
//            FileUtils.writeFile("src/case_study_furama_resort/data/Villa", villa.toString());
//        }else if (fileName.equals("house")){
//            //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
//            System.out.println("Enter standard of room: ");
//            house.setRoomStandard(scanner.nextLine());
//
//            System.out.println("Enter other utility: ");
//            house.setOtherUtility(scanner.nextLine());
//
//            System.out.println("Enter number of floor: ");
//            house.setFloors(Integer.parseInt(scanner.nextLine()));
//
//            FileUtils.writeFile("src/case_study_furama_resort/data/House", house.toString());
//        }else if (fileName.equals("room")){
//            System.out.println("nhap ten dich vu di kem :");
//            String tenDichVuDiKem = scanner.nextLine();
//
//            System.out.println("nhap don vi :");
//            String donVi = scanner.nextLine();
//
//            System.out.println("nhap gia tien :");
//            double giaTien = Double.parseDouble(scanner.nextLine());
//
//            FileUtils.writeFile("src/case_study_furama_resort/data/Villa", room.toString());
//        }
    }
}
