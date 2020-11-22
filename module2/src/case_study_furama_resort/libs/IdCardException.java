package case_study_furama_resort.libs;

public class IdCardException extends Exception {
    public IdCardException() {
        super("Id card number must have 9 digits & follows format XXX XXX XXX.");
    }

    public IdCardException(String message) {
        super(message);
    }
}
