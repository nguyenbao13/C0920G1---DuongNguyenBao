package case_study_furama_resort.commons;

public class IdCardException extends Exception {
    public IdCardException() {
        super("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX.");
    }

    public IdCardException(String message) {
        super(message);
    }
}
