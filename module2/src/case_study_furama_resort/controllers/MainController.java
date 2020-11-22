package case_study_furama_resort.controllers;

import case_study_furama_resort.commons.FileUtils;
import case_study_furama_resort.commons.Validate;
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
        System.out.println("Enter service's name:");
        services.setNameService(scanner.nextLine());
        while (!Validate.serviceNameCheck(services.getNameService())) {
            System.out.println("Not a name (Only first letter must be uppercase)! Re-enter please:");
            services.setNameService(scanner.nextLine());
        }

        System.out.println("Enter using area:");
        String area = scanner.nextLine();
        while (!Validate.areaCheck(area)) {
            System.out.println("Area must be a number & over 30m2! Re-enter please:");
            area = scanner.nextLine();
        }
        services.setUsingArea(Double.parseDouble(area));

        System.out.println("Enter cost of rent:");
        String rentCost = scanner.nextLine();
        while (!Validate.rentCostCheck(rentCost)) {
            System.out.println("Cost of rent must be a number & over Zero! Re-enter please:");
            rentCost = scanner.nextLine();
        }
        services.setRentCost(Double.parseDouble(rentCost));

        System.out.println("Enter max amount of people:");
        String amountMax = scanner.nextLine();
        while (!Validate.amountMaxCheck(amountMax)) {
            System.out.println("Max amount of people must be a number & in range (0,20)! Re-enter please:");
            amountMax = scanner.nextLine();
        }
        services.setAmountMax(Integer.parseInt(amountMax));

        System.out.println("Enter type of rent: ");
        services.setRentType(scanner.nextLine());
        while (!Validate.serviceNameCheck(services.getRentType())) {
            System.out.println("Not type of rent (Only first letter must be uppercase)! Re-enter please:");
            services.setRentType(scanner.nextLine());
        }

        return services;
    }
    public static void addNewVilla() {
        Services services = new Villa();
        Villa villa = (Villa) addNewService(services);
        //ID, Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
        System.out.println("Enter ID: ");
        villa.setId(scanner.nextLine());
        while (!Validate.idVillaCheck(villa.getId())) {
            System.out.println("Not id of villa! Re-enter please: ");
            villa.setId(scanner.nextLine());
        }

        System.out.println("Enter standard of room: ");
        villa.setRoomStandard(scanner.nextLine());
        while (!Validate.serviceNameCheck(villa.getRoomStandard())) {
            System.out.println("Not standard of room! Re-enter please: ");
            villa.setRoomStandard(scanner.nextLine());
        }

        System.out.println("Enter other utilities: ");
        villa.setOtherUtility(scanner.nextLine());

        System.out.println("Enter area of pool: ");
        String poolArea = scanner.nextLine();
        while (!Validate.areaCheck(poolArea)) {
            System.out.println("Area of pool must be a number & over 30m2! Re-enter please: ");
            poolArea = scanner.nextLine();
        }
        villa.setPoolArea(Double.parseDouble(poolArea));

        System.out.println("Enter number of floors: ");
        String floors = scanner.nextLine();
        while (!Validate.floorsCheck(floors)) {
            System.out.println("Not a number of floors! Re-enter please: ");
            floors = scanner.nextLine();
        }
        villa.setFloors(Integer.parseInt(floors));

        FileUtils.writeFile("src/case_study_furama_resort/data/Villa", villa.toString());
        System.out.println("Added new villa successfully!");
    }
    public static void addNewHouse() {
        Services services = new House();
        House house = (House) addNewService(services);
        //ID, Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
        System.out.println("Enter ID: ");
        house.setId(scanner.nextLine());
        while (!Validate.idHouseCheck(house.getId())) {
            System.out.println("Not id of house! Re-enter please: ");
            house.setId(scanner.nextLine());
        }

        System.out.println("Enter standard of room: ");
        house.setRoomStandard(scanner.nextLine());
        while (!Validate.serviceNameCheck(house.getRoomStandard())) {
            System.out.println("Wrong standard of room! Re-enter please: ");
            house.setRoomStandard(scanner.nextLine());
        }

        System.out.println("Enter other utility: ");
        house.setOtherUtility(scanner.nextLine());

        System.out.println("Enter number of floor: ");
        String floors = scanner.nextLine();
        while (!Validate.floorsCheck(floors)) {
            System.out.println("Not a number of floor! Re-enter please: ");
            floors = scanner.nextLine();
        }
        house.setFloors(Integer.parseInt(floors));

        FileUtils.writeFile("src/case_study_furama_resort/data/House", house.toString());
        System.out.println("Added new house successfully!");
    }
    public static void addNewRoom() {
        Services services = new Room();
        Room room = (Room) addNewService(services);
        //ID, Dịch vụ miễn phí đi kèm.
        System.out.println("Enter ID: ");
        room.setId(scanner.nextLine());
        while (!Validate.idRoomCheck(room.getId())) {
            System.out.println("Not id of room! Re-enter please: ");
            room.setId(scanner.nextLine());
        }

        System.out.println("Enter free service: ");
        room.setFreeService(scanner.nextLine());
        while (!Validate.freeServiceCheck(room.getFreeService())) {
            System.out.println("Not free service! Re-enter please: ");
            room.setFreeService(scanner.nextLine());
        }

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

