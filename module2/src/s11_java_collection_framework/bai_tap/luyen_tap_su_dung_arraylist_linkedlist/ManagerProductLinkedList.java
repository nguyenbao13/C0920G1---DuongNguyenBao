package s11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ManagerProductLinkedList extends Product {
    public ManagerProductLinkedList() {
    }
    public ManagerProductLinkedList(int id, String name, int amount) {
        super(id, name, amount);
    }

    static Scanner sc = new Scanner(System.in);
    static List<Product> list = new LinkedList<>();
    public static void addProduct() {
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter amount:");
        int amount = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, amount);
        list.add(product);
        System.out.println("Added Successfully!");
    }
    public static void showProduct() {
        for(Product p : list) {
            System.out.println(p.toString());
            System.out.println("----------------");
        }
    }
    public static void editProduct() {
        boolean check = false;
        System.out.println("Enter ID of editing product:");
        int id = Integer.parseInt(sc.nextLine());
        for(Product p : list) {
            if(id == p.getId()) {
                System.out.println("Enter new ID:");
                p.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter new name:");
                p.setName(sc.nextLine());
                System.out.println("Enter new amount:");
                p.setAmount(Integer.parseInt(sc.nextLine()));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("The product does not exist!");
        }
    }
    public static void sortProductMinToMax() {
        AmountComparator amountComparator = new AmountComparator(true);
        Collections.sort(list, amountComparator);
        System.out.println("Min to Max Sorted!");
    }
    public static void sortProductMaxToMin() {
        AmountComparator amountComparator = new AmountComparator(false);
        Collections.sort(list, amountComparator);
        System.out.println("Max to Min Sorted!");
    }
    public static void searchProduct() {
        boolean check = false;
        System.out.println("Enter product to search:");
        String str = sc.nextLine();
        for(Product p : list) {
            if(str.equals(p.getName())) {
                System.out.println(p.toString());
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.println("The product does not exist!");
        }
    }
    public static void removeProduct() {
        boolean check = false;
        System.out.println("Enter ID of product to remove:");
        int idRemove = Integer.parseInt(sc.nextLine());
        for(Product p : list) {
            if(idRemove == p.getId()) {
                list.remove(p);
                check = true;
                System.out.println("Remove successfully!");
                break;
            }
        }
        if(!check) {
            System.out.println("The product does not exist!");
        }
    }
    public static void Exit() {
        System.out.println("Goodbye !");
        System.exit(0);
    }
    public static void Menu() {
        System.out.println(" 1. Add new product." +
                "\n 2. Show product(s)." +
                "\n 3. Edit product by ID." +
                "\n 4. Remove product by ID." +
                "\n 5. Search product by ID." +
                "\n 6. Sort product from min to max." +
                "\n 7. Sort product from max to min." +
                "\n 8. Exit." +
                "\n Enter a number: ");
        int chosen = Integer.parseInt(sc.nextLine());
        switch (chosen) {
            case 1: addProduct();
                    break;
            case 2: showProduct();
                    break;
            case 3: editProduct();
                    break;
            case 4: removeProduct();
                    break;
            case 5: searchProduct();
                    break;
            case 6: sortProductMinToMax();
                    break;
            case 7: sortProductMaxToMin();
                    break;
            case 8: Exit();
                    break;
        }
    }
}
