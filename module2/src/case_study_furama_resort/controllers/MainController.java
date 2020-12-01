package case_study_furama_resort.controllers;

import case_study_furama_resort.commons.*;
import case_study_furama_resort.libs.*;
import case_study_furama_resort.models.*;
import case_study_furama_resort.services.ManagerHouses;
import case_study_furama_resort.services.ManagerRooms;
import case_study_furama_resort.services.ManagerVillas;

import java.util.*;

import static case_study_furama_resort.commons.FileUtils.readFile;
import static case_study_furama_resort.commons.FileUtils.writeFile;
import static case_study_furama_resort.commons.Validate.*;

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
                            "6. Show Information of Employees.\n" +
                            "7. Search employee.\n" +
                            "8. Exit.\n" +
                            "Enter a number (1-7):");
            int chosen = Integer.parseInt(scanner.nextLine());
            switch (chosen) {
                case 1: addNewServices();
                break;
                case 2: showServices();
                break;
                case 3: addNewCustomer();
                break;
                case 4: showInformationCustomer();
                break;
                case 5: addNewBooking();
                break;
                case 6: showInformationEmployee();
                break;
                case 7: FilingCabinets.SearchEmployee();
                break;
                case 8: System.exit(0);
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
        while (!serviceNameCheck(services.getNameService())) {
            System.out.println("Not a name (Only first letter must be uppercase)! Re-enter please:");
            services.setNameService(scanner.nextLine());
        }

        System.out.println("Enter using area:");
        String area = scanner.nextLine();
        while (!areaCheck(area)) {
            System.out.println("Area must be a number & over 30m2! Re-enter please:");
            area = scanner.nextLine();
        }
        services.setUsingArea(Double.parseDouble(area));

        System.out.println("Enter cost of rent:");
        String rentCost = scanner.nextLine();
        while (!rentCostCheck(rentCost)) {
            System.out.println("Cost of rent must be a number & over Zero! Re-enter please:");
            rentCost = scanner.nextLine();
        }
        services.setRentCost(Double.parseDouble(rentCost));

        System.out.println("Enter max amount of people:");
        String amountMax = scanner.nextLine();
        while (!amountMaxCheck(amountMax)) {
            System.out.println("Max amount of people must be a number & in range (0,20)! Re-enter please:");
            amountMax = scanner.nextLine();
        }
        services.setAmountMax(Integer.parseInt(amountMax));

        System.out.println("Enter type of rent: ");
        services.setRentType(scanner.nextLine());
        while (!serviceNameCheck(services.getRentType())) {
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
        while (!idVillaCheck(villa.getId())) {
            System.out.println("Not id of villa! Re-enter please: ");
            villa.setId(scanner.nextLine());
        }

        System.out.println("Enter standard of room: ");
        villa.setRoomStandard(scanner.nextLine());
        while (!serviceNameCheck(villa.getRoomStandard())) {
            System.out.println("Not standard of room! Re-enter please: ");
            villa.setRoomStandard(scanner.nextLine());
        }

        System.out.println("Enter other utilities: ");
        villa.setOtherUtility(scanner.nextLine());

        System.out.println("Enter area of pool: ");
        String poolArea = scanner.nextLine();
        while (!areaCheck(poolArea)) {
            System.out.println("Area of pool must be a number & over 30m2! Re-enter please: ");
            poolArea = scanner.nextLine();
        }
        villa.setPoolArea(Double.parseDouble(poolArea));

        System.out.println("Enter number of floors: ");
        String floors = scanner.nextLine();
        while (!floorsCheck(floors)) {
            System.out.println("Not a number of floors! Re-enter please: ");
            floors = scanner.nextLine();
        }
        villa.setFloors(Integer.parseInt(floors));

        writeFile("src/case_study_furama_resort/data/Villa", villa.toString());
        System.out.println("Added new villa successfully!");
    }
    public static void addNewHouse() {
        Services services = new House();
        House house = (House) addNewService(services);
        //ID, Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
        System.out.println("Enter ID: ");
        house.setId(scanner.nextLine());
        while (!idHouseCheck(house.getId())) {
            System.out.println("Not id of house! Re-enter please: ");
            house.setId(scanner.nextLine());
        }

        System.out.println("Enter standard of room: ");
        house.setRoomStandard(scanner.nextLine());
        while (!serviceNameCheck(house.getRoomStandard())) {
            System.out.println("Wrong standard of room! Re-enter please: ");
            house.setRoomStandard(scanner.nextLine());
        }

        System.out.println("Enter other utility: ");
        house.setOtherUtility(scanner.nextLine());

        System.out.println("Enter number of floor: ");
        String floors = scanner.nextLine();
        while (!floorsCheck(floors)) {
            System.out.println("Not a number of floor! Re-enter please: ");
            floors = scanner.nextLine();
        }
        house.setFloors(Integer.parseInt(floors));

        writeFile("src/case_study_furama_resort/data/House", house.toString());
        System.out.println("Added new house successfully!");
    }
    public static void addNewRoom() {
        Services services = new Room();
        Room room = (Room) addNewService(services);
        //ID, Dịch vụ miễn phí đi kèm.
        System.out.println("Enter ID: ");
        room.setId(scanner.nextLine());
        while (!idRoomCheck(room.getId())) {
            System.out.println("Not id of room! Re-enter please: ");
            room.setId(scanner.nextLine());
        }

        System.out.println("Enter free service: ");
        room.setFreeService(scanner.nextLine());
        while (!freeServiceCheck(room.getFreeService())) {
            System.out.println("Not free service! Re-enter please: ");
            room.setFreeService(scanner.nextLine());
        }

        writeFile("src/case_study_furama_resort/data/Room", room.toString());
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
                            "6. Show All Name Room Not Duplicate.\n" +
                            "7. Back to menu.\n" +
                            "8. Exit.\n" +
                            "Enter a number (1-8):");
            int showServicesChosen = Integer.parseInt(scanner.nextLine());
            switch (showServicesChosen) {
                case 1: ManagerVillas.showVilla();
                break;
                case 2: ManagerHouses.showHouse();
                break;
                case 3: ManagerRooms.showRoom();
                break;
                case 4: showVillaNotDuplicate();
                break;
                case 5: showHouseNotDuplicate();
                break;
                case 6: showRoomNotDuplicate();
                break;
                case 7: displayMainMenu();
                break;
                case 8: System.exit(0);
                break;
            }
        }
    }

    public static void addNewCustomer() {
        //Họ tên , Ngày sinh, Giới tính, Số CMND,
        // Số ĐT, Email, Loại khách, Địa chỉ
        Customer customer = new Customer();
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Enter customer's full name:");
                String nameCustomer = scanner.nextLine();
                nameCustomerCheck(nameCustomer);
                check = true;
                customer.setNameCustomer(nameCustomer);
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter customer's birthday:");
                String birthday = scanner.nextLine();
                birthdayCheck(birthday);
                check = true;
                customer.setBirthday(birthday);
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter customer's gender:");
                String temp = scanner.nextLine().toLowerCase();
                genderCheck(temp);
                check = true;
                String gender = temp.substring(0,1).toUpperCase() + temp.substring(1);
                customer.setGender(gender);
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter customer's id card number:");
                String idNumber = scanner.nextLine();
                idCardNumberCheck(idNumber);
                check = true;
                customer.setIdCardNumber(idNumber);
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        System.out.println("Enter customer's phone number:");
        customer.setPhoneNumber(scanner.nextLine());

        while (!check) {
            try {
                System.out.println("Enter customer's email:");
                String email = scanner.nextLine();
                emailCheck(email);
                check = true;
                customer.setEmail(email);
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        System.out.println("Enter type of customer:");
        customer.setTypeOfCustomer(scanner.nextLine());

        System.out.println("Enter customer's address:");
        customer.setAddress(scanner.nextLine());
        writeFile("src/case_study_furama_resort/data/Customer", customer.toString());
        System.out.println("Added new customer successfully!");
    }
    public static void showInformationCustomer() {
        List<String> list = readFile("src/case_study_furama_resort/data/Customer");
        String[] strings;
        Customer customer;
        List<Customer> customerList = new ArrayList<>();
        for(String line : list) {
            strings = line.split(", ");
            customer = new Customer(strings[0], strings[1], strings[2], strings[3],
                    strings[4], strings[5], strings[6], strings[7]);
            customerList.add(customer);
        }
        Collections.sort(customerList, new SortCustomer());
        for(Customer cus : customerList) {
            System.out.println(cus);
        }
    }

    public static void addNewBooking() {
        List<String> customerList = readFile("src/case_study_furama_resort/data/Customer");
        Customer customer = null;
        for(int i = 0; i < customerList.size(); i++) {
            System.out.println((i+1) + ", " + customerList.get(i));
        }
        System.out.println("Enter number of customer to book:");
        int number = Integer.parseInt(scanner.nextLine());
        String[] strings;
        for(int j = 0; j < customerList.size(); j++) {
            if(number == j+1) {
                strings = customerList.get(j).split(",");
                customer = new Customer(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7]);
            }
        }
        System.out.println("1. Booking Villa\n" +
                            "2. Booking House\n" +
                            "3. Booking Room");
        int numBooking = Integer.parseInt(scanner.nextLine());
        switch (numBooking) {
            case 1: {
                ManagerVillas.showVilla();
                System.out.println("Enter number of villa to append:");
                int choose = Integer.parseInt(scanner.nextLine());
                Villa villa = null;
                List<Villa> list = ManagerVillas.getAllVilla();
                for (int i = 0; i < list.size(); i++) {
                    if (choose == i + 1) {
                        villa = list.get(i);
                    }
                }
                customer.setUsingService(villa);
            }
            break;
            case 2: {
                ManagerHouses.showHouse();
                System.out.println("Enter number of house to append:");
                int choose = Integer.parseInt(scanner.nextLine());
                House house = null;
                List<House> list = ManagerHouses.getAllHouse();
                for (int i = 0; i < list.size(); i++) {
                    if (choose == i + 1) {
                        house = list.get(i);
                    }
                }
                customer.setUsingService(house);
            }
            break;
            case 3: {
                ManagerRooms.showRoom();
                System.out.println("Enter number of room to append:");
                int choose = Integer.parseInt(scanner.nextLine());
                Room room = null;
                List<Room> list = ManagerRooms.getAllRoom();
                for (int i = 0; i < list.size(); i++) {
                    if (choose == i + 1) {
                        room = list.get(i);
                    }
                }
                customer.setUsingService(room);
            }
            break;
        }
        writeFile("src/case_study_furama_resort/data/Booking", customer.toString());
    }

    public static void showVillaNotDuplicate() {
        List<String> villaList = readFile("src/case_study_furama_resort/data/Villa");
        String[] strings;
        TreeSet<String> treeSetVilla = new TreeSet<>();
        for(String line : villaList) {
            strings = line.split(", ");
            treeSetVilla.add(strings[1]);
        }
        for(String name : treeSetVilla) {
            System.out.println(name);
        }
        displayMainMenu();
    }
    public static void showHouseNotDuplicate() {
        List<String> houseList = readFile("src/case_study_furama_resort/data/House");
        String[] strings;
        TreeSet<String> treeSetHouse = new TreeSet<>();
        for(String line : houseList) {
            strings = line.split(", ");
            treeSetHouse.add(strings[1]);
        }
        for(String name : treeSetHouse) {
            System.out.println(name);
        }
        displayMainMenu();
    }
    public static void showRoomNotDuplicate() {
        List<String> roomList = readFile("src/case_study_furama_resort/data/Room");
        String[] strings;
        TreeSet<String> treeSetRoom = new TreeSet<>();
        for(String line : roomList) {
            strings = line.split(", ");
            treeSetRoom.add(strings[1]);
        }
        for(String name : treeSetRoom) {
            System.out.println(name);
        }
        displayMainMenu();
    }
    public static void showInformationEmployee() {
        List<String> employeeList = readFile("src/case_study_furama_resort/data/Employees");
        String[] strings;
        Employee employee;
        int i = 1;
        Map<Integer, String> map = new HashMap<Integer, String>();
        for(String line : employeeList) {
            strings = line.split(", ");
            employee = new Employee(strings[0], strings[1], strings[2]);
            map.put(i, employee.toString());
            i++;
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}