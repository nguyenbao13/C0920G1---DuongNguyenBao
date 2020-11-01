package s7_abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);
    }
}
