package contact_manager.controllers;

import java.util.Scanner;

import static contact_manager.managers.ContactsManager.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        showMainMenu();
    }
    public static void showMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new contacts.\n" +
                    "2. Show all contacts.\n" +
                    "3. Edit contacts.\n" +
                    "4. Delete contacts.\n" +
                    "5. Search contacts.\n" +
                    "Enter a number:");
            int input = scanner.nextInt();
            while (input < 1 || input > 5) {
                System.out.println("Please re-enter:");
                input = scanner.nextInt();
            }
            switch (input) {
                case 1: addNewContacts();
                break;
                case 2: showAllContacts();
                break;
                case 3: editContacts();
                break;
                case 4: deleteContacts();
                break;
                case 5: searchContacts();
                break;
            }
        }
    }

}
