package s1_introduction_to_java.thuc_hanh.phuong_trinh_bac_nhat;
import java.util.Scanner;
public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        }else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
