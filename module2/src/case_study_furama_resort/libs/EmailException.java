package case_study_furama_resort.libs;

public class EmailException extends Exception {
    public EmailException() {
        super("Email must follow format abc@abc.abc");
    }

    public EmailException(String message) {
        super(message);
    }
}
