package s6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

import s6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ", color = " + getColor() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
    //TriangleTest
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of three sides:");
        double side1 = Double.valueOf(scanner.nextLine());
        double side2 = Double.valueOf(scanner.nextLine());
        double side3 = Double.valueOf(scanner.nextLine());
        System.out.println("Enter color:");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(color, true, side1, side2, side3);
        System.out.println(triangle);
    }
}
