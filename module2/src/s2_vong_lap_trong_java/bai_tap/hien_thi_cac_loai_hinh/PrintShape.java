package s2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;
import java.util.Scanner;
public class PrintShape {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print('*');
                        }
                        System.out.print('\n');
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) { //tam giác vuông góc trái dưới
                        for (int j = 0; j <= i; j++) {
                            System.out.print('*');
                        }
                        System.out.print('\n');
                    }
                    System.out.print('\n');
                    for (int i = 0; i < 5; i++) { //tam giác vuông góc trái trên
                        for (int j = 5; j > i; j--) {
                            System.out.print('*');
                        }
                        System.out.print('\n');
                    }
                    System.out.print('\n');
                    for (int i = 0; i < 5; i++) { //tam giác vuông góc phải dưới
                        for (int j = 0; j < 5; j++) {
                            if (j < 4-i) {
                                System.out.print(' ');
                            } else {
                                System.out.print('*');
                            }
                        }
                        System.out.print('\n');
                    }
                    System.out.print('\n');
                    for (int i = 0; i < 5; i++) { //tam giác vuông góc phải trên
                        for (int j = 0; j < 5; j++) {
                            if (j < i) {
                                System.out.print(' ');
                            } else {
                                System.out.print('*');
                            }
                        }
                        System.out.print('\n');
                    }
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            if (7/2 - i <= j && 7/2 + i >= j) {
                                System.out.print('*');
                            } else {
                                System.out.print(' ');
                            }
                        }
                        System.out.print('\n');
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.print("No choice!");
            }
        }
    }
}
