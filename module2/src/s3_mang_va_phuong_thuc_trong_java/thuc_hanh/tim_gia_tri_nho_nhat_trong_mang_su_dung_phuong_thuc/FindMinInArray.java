package s3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_nho_nhat_trong_mang_su_dung_phuong_thuc;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    }
    public static int minValue(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
