package s4_lop_va_doi_tuong_trong_java.bai_tap.lop_phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    double getDiscriminant(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        return delta;
    }
    double getRoot1(double a, double b, double c) {
        double r1 = (-b + Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
        return r1;
    }
    double getRoot2(double a, double b, double c) {
        double r2 = (-b - Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
        return r2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a: ");
        double a = Double.valueOf(sc.nextLine());
        System.out.printf("Enter b: ");
        double b = Double.valueOf(sc.nextLine());
        System.out.printf("Enter c: ");
        double c = Double.valueOf(sc.nextLine());
        double delta = b*b - 4*a*c;
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (delta > 0) {
            System.out.printf("The equation has two roots %f and %f",qe.getRoot1(a,b,c),qe.getRoot2(a,b,c));
        } else if (delta == 0) {
            System.out.printf("The equation has one root %f",qe.getRoot1(a,b,c));
        } else {
            System.out.printf("The equation has no roots");
        }
    }
}
