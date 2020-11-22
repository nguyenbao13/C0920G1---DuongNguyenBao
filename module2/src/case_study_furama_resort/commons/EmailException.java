package case_study_furama_resort.commons;

public class EmailException extends Exception {
    public EmailException() {
        super("Email phải đúng định dạng abc@abc.abc");
    }

    public EmailException(String message) {
        super(message);
    }
}
