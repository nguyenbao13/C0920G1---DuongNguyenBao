package case_study_furama_resort.libs;

public class NameException extends Exception {
    public NameException() {
        super("Customer's name must be uppercase the first letter for each word.");
    }

    public NameException(String message) {
        super(message);
    }
}
