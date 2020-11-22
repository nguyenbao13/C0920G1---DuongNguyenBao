package case_study_furama_resort.libs;

public class GenderException extends Exception {
    public GenderException() {
        super("Not a kind of gender.");
    }

    public GenderException(String message) {
        super(message);
    }
}
