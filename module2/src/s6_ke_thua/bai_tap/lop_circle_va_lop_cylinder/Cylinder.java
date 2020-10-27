package s6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius = " + getRadius() +
                ", color = " + getColor() +
                ", height = " + height +
                ", volume = " + getVolume() +
                '}';
    }
    //CylinderTest
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(4);
        System.out.println(cylinder);
        cylinder = new Cylinder(3,"green",2);
        System.out.println(cylinder);
    }
}
