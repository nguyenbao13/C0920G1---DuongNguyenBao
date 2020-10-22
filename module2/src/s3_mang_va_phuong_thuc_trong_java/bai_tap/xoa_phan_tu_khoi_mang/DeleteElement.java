package s3_mang_va_phuong_thuc_trong_java.bai_tap.xoa_phan_tu_khoi_mang;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhập phần tử cần xóa:");
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
