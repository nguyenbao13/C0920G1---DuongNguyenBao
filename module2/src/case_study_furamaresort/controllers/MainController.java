package case_study_furamaresort.controllers;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        System.out.println("1. Add New Services\n" +
                        "2. Show Services\n" +
                        "3. Add New Customer\n" +
                        "4. Show Information of Customer\n" +
                        "5. Add New Booking\n" +
                        "6. Show Information of Employee\n" +
                        "7. Exit\n" +
                        "Enter a number (1-7):\n");
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
//            case 7: exit();
//                    break;
        }
    }
    public void addNewServices() {
        System.out.println("1. Add New Villa\n" +
                        "2. Add New House\n" +
                        "3. Add New Room\n" +
                        "4. Back to menu\n" +
                        "5. Exit\n" +
                        "Enter a number (1-5):\n");
        int chosen = Integer.parseInt(scanner.nextLine());
        switch (chosen) {
            case 1:
        }
    }
}
