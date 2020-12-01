package bank_manager.controllers;

import bank_manager.models.Customer;
import bank_manager.models.LongTermBook;
import bank_manager.models.SavingBook;
import bank_manager.models.UnlimitedBook;
import bank_manager.validate.Validate;

import java.util.Scanner;

import static bank_manager.commons.FileUtils.*;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        showMainMenu();
    }
    public static void showMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Choose function by number (to continue):\n" +
                    "1. Add new saving book.\n" +
                    "2. Delete saving book.\n" +
                    "3. Show saving book list.\n" +
                    "4. Show customer's information.\n" +
                    "5. Search saving book.\n" +
                    "6. Exit.\n" +
                    "Choose number:");
            int input = scanner.nextInt();
            while (input < 1 || input > 6) {
                System.out.println("Please re-enter:");
                input = scanner.nextInt();
            }
            switch (input) {
                case 1: addNewBook();
                    break;
//                case 2: deleteBook();
//                    break;
//                case 3: showAllBook();
//                    break;
//                case 4: showAllCustomer();
//                    break;
//                case 5: searchBook();
//                    break;
                case 6: System.exit(0);
            }
        }
    }
    public static void addNewBook() {
        System.out.println("Long term or short term ?\n" +
                "1. Long term.\n" +
                "2. Short term.");
        int input = scanner.nextInt();
        switch (input) {
            case 1: addNewLongTerm();
            break;
            case 2: addNewShortTerm();
            break;
        }

    }
    public static SavingBook addNewSavingBook(SavingBook savingBook) {
        System.out.println("Enter id book:");
        String id = scanner.nextLine();
        while (!Validate.idBookCheck(id)) {
            System.out.println("Re-Enter id book:");
            id = scanner.nextLine();
        }
        savingBook.setIdBook(id);

        System.out.println("Enter id customer:");
        String idc = scanner.nextLine();
        boolean check = false;
        while (!check) {
            for(Customer customer : readFile("src/bank_manager/data/Customer")) {
                if(customer.getIdCustomer().equals(idc)) {
                    savingBook.setIdCustomer(idc);
                    check = true;
                    break;
                }
            }
            if(!check) {
                System.out.println("Re-Enter id customer:");
                idc = scanner.nextLine();
            }
        }

        System.out.println("Enter open date:");
        String date = scanner.nextLine();
        while (!Validate.dateCheck(date)) {
            System.out.println("Re-Enter open date:");
            date = scanner.nextLine();
        }
        savingBook.setOpenDate(date);

        System.out.println("Enter start date:");
        String stDate = scanner.nextLine();
        while (!Validate.dateCheck(stDate)) {
            System.out.println("Re-Enter start date:");
            stDate = scanner.nextLine();
        }
        savingBook.setStartDate(stDate);

        System.out.println("Enter money:");
        String money = scanner.nextLine();
        while (!Validate.moneyCheck(money)) {
            System.out.println("Re-Enter money:");
            money = scanner.nextLine();
        }
        savingBook.setMoney(money);

        System.out.println("Enter interest:");
        String interesr = scanner.nextLine();
        while (!Validate.interestCheck(interesr)) {
            System.out.println("Re-Enter interest:");
            interesr = scanner.nextLine();
        }
        savingBook.setInterest(interesr);

        return savingBook;
    }
    public static void addNewLongTerm() {
        SavingBook savingBook = new LongTermBook();
        LongTermBook longTermBook = (LongTermBook) addNewSavingBook(savingBook);

        System.out.println("Enter long term:");
        String term = scanner.nextLine();
        while (!Validate.longTermCheck(term)) {
            System.out.println("Re-Enter long term:");
            term = scanner.nextLine();
        }
        longTermBook.setTerm(term);

        System.out.println("Enter bonus:");
        String bonus = scanner.nextLine();
        while (!Validate.bonusCheck(bonus)) {
            System.out.println("Re-Enter bonus:");
            bonus = scanner.nextLine();
        }
        longTermBook.setBonus(bonus);
        writeLongTermFile("src/bank_manager/data/longTerm.csv", longTermBook);
    }
    public static void addNewShortTerm() {
        System.out.println("Unlimited or Limited?\n" +
                "1. Unlimited.\n" +
                "2. Limited.");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: addNewUnlimited();
            break;
//            case 2: addNewLimited();
//            break;
        }
    }
    public static void addNewUnlimited() {
        SavingBook savingBook = new LongTermBook();
        UnlimitedBook unlimitedBook = (UnlimitedBook) addNewSavingBook(savingBook);
        //writeShortTermFile1();
    }
}
