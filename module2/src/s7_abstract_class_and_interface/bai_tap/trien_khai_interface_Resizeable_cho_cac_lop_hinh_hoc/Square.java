package s7_abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + getSide() +
                ", which is a subclass of " + super.toString() +
                '}'+"\n";
    }

    public double resize(double percent) {
        setSide( getSide()* ((100+Math.random()*percent)/100));
        return 0;
    }
}
