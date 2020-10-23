package s3_mang_va_phuong_thuc_trong_java.bai_tap.gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter length of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d element: ", i);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.printf("Min value in array is %d", min);
    }
}
