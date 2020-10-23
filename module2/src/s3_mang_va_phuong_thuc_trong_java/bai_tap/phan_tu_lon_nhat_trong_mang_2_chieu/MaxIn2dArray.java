package s3_mang_va_phuong_thuc_trong_java.bai_tap.phan_tu_lon_nhat_trong_mang_2_chieu;

import java.util.Scanner;

public class MaxIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng ma trận: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột ma trận: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập phần tử tọa độ [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        //In ma trận và tìm max
        System.out.printf("Ma trận %d hàng %d cột:\n", row, col);
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("Phần tử lớn nhất ma trận: %d", max);
    }
}
