package contact_manager.managers;

import contact_manager.commons.FileUtils;
import contact_manager.models.Person;

import java.util.List;
import java.util.Scanner;

import static contact_manager.commons.Validate.*;
import static contact_manager.controllers.Main.showMainMenu;

public class ContactsManager {
    //static List<Person> personList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void addNewContacts() {
        Person person = new Person();
        System.out.println("Enter new person's name:");
        String name = scanner.nextLine();
        while (!nameCheck(name)) {
            System.out.println("Not right format, re-enter name please:");
            name = scanner.nextLine();
        }
        person.setName(name);

        System.out.println("Enter new person's gender:");
        String gender = scanner.nextLine();
        while (!genderCheck(gender)) {
            System.out.println("Not right format, re-enter gender please:");
            gender = scanner.nextLine();
        }
        person.setGender(gender);

        System.out.println("Enter new person's group:");
        String group = scanner.nextLine();
        while (!groupCheck(group)) {
            System.out.println("Not right format, re-enter group please:");
            group = scanner.nextLine();
        }
        person.setGroup(group);

        System.out.println("Enter new person's phone number:");
        String phoneNumber = scanner.nextLine();
        while (!phoneNumberCheck(phoneNumber)) {
            System.out.println("Not right format, re-enter phone number please:");
            phoneNumber = scanner.nextLine();
        }
        person.setPhoneNumber(phoneNumber);

        System.out.println("Enter new person's address:");
        String address = scanner.nextLine();
        while (!addressCheck(address)) {
            System.out.println("Not right format, re-enter address please:");
            address = scanner.nextLine();
        }
        person.setAddress(address);

        FileUtils.writeFileAutoId("src/contact_manager/data/Contact.csv", person);
        System.out.println("Added new contact successfully!");
    }

    public static void showAllContacts() {
        List<Person> personList = FileUtils.readFile("src/contact_manager/data/Contact.csv");
        for(Person person : personList) {
            System.out.println(person.getName());
        }
        scanner.nextLine();
        for(Person person : personList) {
            System.out.println(person.getGender());
        }
        scanner.nextLine();
        for(Person person : personList) {
            System.out.println(person.getGroup());
        }
        scanner.nextLine();
        for(Person person : personList) {
            System.out.println(person.getPhoneNumber());
        }
        scanner.nextLine();
        for(Person person : personList) {
            System.out.println(person.getAddress());
        }
    }

    public static void editContacts() {
        List<Person> personList = FileUtils.readFile("src/contact_manager/data/Contact.csv");
        System.out.println("Enter person's phone number whose be edited:");
        String phoneNumber = scanner.nextLine();
        if(phoneNumber == "") {
            showMainMenu();
        } else {
            boolean check = false;
            while (!check) {
                for(Person person : personList) {
                    if(person.getPhoneNumber().equals(phoneNumber)) {
                        System.out.println("Enter person's new name:");
                        person.setName(scanner.nextLine());
                        System.out.println("Enter person's new gender:");
                        person.setGender(scanner.nextLine());
                        System.out.println("Enter person's new group:");
                        person.setGroup(scanner.nextLine());
                        System.out.println("Enter person's new phone number:");
                        person.setPhoneNumber(scanner.nextLine());
                        System.out.println("Enter person's new address:");
                        person.setAddress(scanner.nextLine());
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    System.out.println("Can't find the phone number! Please re-enter:");
                    phoneNumber = scanner.nextLine();
                }
            }
        }
        FileUtils.overWriteContactFile("src/contact_manager/data/Contact.csv", personList);
    }

    public static void deleteContacts() {
        List<Person> personList = FileUtils.readFile("src/contact_manager/data/Contact.csv");
        System.out.println("Enter person's phone number whose be deleted:");
        String phoneNumber = scanner.nextLine();
        if(phoneNumber == "") {
            showMainMenu();
        } else {
            boolean check = false;
            while (!check) {
                for(int i = 0; i < personList.size(); i++) {
                    if(personList.get(i).getPhoneNumber().equals(phoneNumber)) {
                        System.out.println("Are you sure to delete this contact ? (Enter 'Y' to confirm)");
                        String confirm = scanner.nextLine();
                        if(confirm.equals("Y")) {
                            personList.remove(personList.get(i));
                        } else {
                            showMainMenu();
                        }
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    System.out.println("Can't find the phone number! Please re-enter:");
                    phoneNumber = scanner.nextLine();
                }
            }
        }
        FileUtils.overWriteContactFile("src/contact_manager/data/Contact.csv", personList);
    }

    public static void searchContacts() {
        List<Person> personList = FileUtils.readFile("src/contact_manager/data/Contact.csv");;
        System.out.println("Enter phone number or name to search:");
        String finding = scanner.nextLine();
        boolean check = false;
        for(Person person : personList) {
            if(person.getPhoneNumber().contains(finding) || person.getName().contains(finding)) {
                System.out.println("Find out the contact!");
                System.out.println(person.toString());
                check = true;
            }
        }
        if(!check) {
            System.out.println("The contact doesn't exist!");
        }
    }
}
