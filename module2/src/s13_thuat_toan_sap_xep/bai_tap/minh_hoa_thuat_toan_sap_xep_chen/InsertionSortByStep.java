package s13_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }
    public static void insertionSortByStep(int[] list) {
        for(int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for(k = i-1; k >= 0; k--) {
                if(list[k] > currentElement) {
                    list[k+1] = list[k];
                } else {
                    break;
                }
            }
            list[k+1] = currentElement;
            System.out.print("List after the  " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Array may be sorted and next pass not needed");
    }
}
