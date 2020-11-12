package s14_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class TestIllegalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A side of triangle:");
        int aSide = input.nextInt();
        System.out.println("Enter B side of triangle:");
        int bSide = input.nextInt();
        System.out.println("Enter C side of triangle:");
        int cSide = input.nextInt();
        try {
            checkIllegalTriangle(aSide, bSide, cSide);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void checkIllegalTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a+b <= c || a+c <= b || b+c <= a || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException();
        }
    }
}
