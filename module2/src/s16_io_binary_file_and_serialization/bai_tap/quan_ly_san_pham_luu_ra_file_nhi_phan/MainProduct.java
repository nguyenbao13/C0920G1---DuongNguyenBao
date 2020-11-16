package s16_io_binary_file_and_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import case_study_furama_resort.commons.FileUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> list = new LinkedList<>();
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. Add new product.\n" +
                    "2. Show product.\n" +
                    "3. Search product.\n" +
                    "4. Exit.\n" +
                    "Enter a number (1-4):");
            int chosen = Integer.parseInt(scanner.nextLine());
            switch (chosen) {
                case 1: addNewProduct();
                    break;
                case 2: showProduct();
                    break;
                case 3: searchProduct();
                    break;
                case 4: isExit = true;
                    break;
            }
        }
    }
    public static void addNewProduct() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product();
        System.out.println("Enter id of product:");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name of product:");
        product.setName(scanner.nextLine());
        System.out.println("Enter brand of product:");
        product.setBrand(scanner.nextLine());
        System.out.println("Enter price of product:");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        list.add(product);
        System.out.println("Added successfully!");
        productList.add(product);
        FileUtils.writeBinaryFile("src/s16_io_binary_file_and_serialization/bai_tap/" +
                "quan_ly_san_pham_luu_ra_file_nhi_phan/binaryFile.dat", productList);
    }
    public static void showProduct() {
        for(Product p : list) {
            System.out.println(p.toString());
            System.out.println("----------");
        }
    }
    public static void searchProduct() {
        boolean check = false;
        System.out.println("Enter product to search:");
        String input = scanner.nextLine();
        for(Product p : list) {
            if(p.getName().equals(input)) {
                System.out.println("There is a product " + p.toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("The product doesn't exist!");
        }
    }
}
