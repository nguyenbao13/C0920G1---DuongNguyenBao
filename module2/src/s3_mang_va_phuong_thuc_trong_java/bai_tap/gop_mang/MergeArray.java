package s3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[4];
        int[] arr3 = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + " của mảng 1:");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + " của mảng 2:");
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i-arr1.length];
            }
        }
        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        System.out.println("Mảng 2: " + Arrays.toString(arr2));
        System.out.println("Mảng 3: " + Arrays.toString(arr3));
    }
}
