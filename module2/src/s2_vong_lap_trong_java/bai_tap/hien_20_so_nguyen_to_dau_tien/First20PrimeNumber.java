package s2_vong_lap_trong_java.bai_tap.hien_20_so_nguyen_to_dau_tien;

public class First20PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        boolean check = true;
        System.out.println("20 số nguyên tố đầu tiên:");
        while (count < 20) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.print(num + ", ");
            }
            num++;
            check = true;
        }
    }
}
