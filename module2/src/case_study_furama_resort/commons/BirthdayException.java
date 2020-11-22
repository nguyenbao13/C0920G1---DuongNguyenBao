package case_study_furama_resort.commons;

public class BirthdayException extends Exception {
    public BirthdayException() {
        super("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy.");
    }

    public BirthdayException(String message) {
        super(message);
    }
}
