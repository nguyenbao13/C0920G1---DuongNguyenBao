package s14_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_IllegalTriangleException;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("This is not a triangle!");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
