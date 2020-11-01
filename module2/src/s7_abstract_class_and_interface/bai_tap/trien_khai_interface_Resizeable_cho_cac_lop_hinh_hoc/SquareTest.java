package s7_abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square("yellow", true, 4.8);
        System.out.println(square);
    }
}
