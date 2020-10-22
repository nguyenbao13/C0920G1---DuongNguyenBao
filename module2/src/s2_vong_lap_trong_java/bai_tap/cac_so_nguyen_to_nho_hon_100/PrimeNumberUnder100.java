package s2_vong_lap_trong_java.bai_tap.cac_so_nguyen_to_nho_hon_100;

public class PrimeNumberUnder100 {
    public static void main(String[] args) {
        int num = 2;
        boolean check = true;
        System.out.print("Các số nguyên tố nhỏ hơn 100:");
        while (num < 100) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(num + ", ");
            }
            num++;
            check = true;
        }
    }
}
