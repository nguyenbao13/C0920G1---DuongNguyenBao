package s5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {}
    Circle(double radius) {
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
