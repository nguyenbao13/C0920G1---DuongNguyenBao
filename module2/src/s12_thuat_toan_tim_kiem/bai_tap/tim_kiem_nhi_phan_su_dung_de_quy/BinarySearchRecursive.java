package s12_thuat_toan_tim_kiem.bai_tap.tim_kiem_nhi_phan_su_dung_de_quy;

public class BinarySearchRecursive {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int low, int high, int value) {

        if (high >= low) {
            int mid = (low + high) / 2;
            if (value < list[mid]) {
                return binarySearch(list, low, mid-1, value);
            } else if (value == list[mid]) {
                return mid;
            } else {
                return binarySearch(list, mid+1, high, value);
            }
        } else {
            return -1; /* Now high < low, key not found */
        }
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 0, 12, 2));  /* 0 */
        System.out.println(binarySearch(list, 0, 12, 11)); /* 4 */
        System.out.println(binarySearch(list, 0, 12, 79)); /*12 */
        System.out.println(binarySearch(list, 0, 12, 1));  /*-1 */
        System.out.println(binarySearch(list, 0, 12, 5));  /*-1 */
        System.out.println(binarySearch(list, 0, 12, 80)); /*-1 */
    }
}
