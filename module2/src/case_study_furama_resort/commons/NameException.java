package case_study_furama_resort.commons;

public class NameException extends Exception {
    public NameException() {
        super("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ.");
    }

    public NameException(String message) {
        super(message);
    }
}
