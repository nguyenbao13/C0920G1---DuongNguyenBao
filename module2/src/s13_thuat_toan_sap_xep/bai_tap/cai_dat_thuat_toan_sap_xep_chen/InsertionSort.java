package s13_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSort {
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
            System.out.print(list[i] + " ");
        }
        System.out.println();
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
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
        }
        System.out.print("List after sorted: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
    }
}
