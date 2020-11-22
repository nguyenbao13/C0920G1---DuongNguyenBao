package case_study_furama_resort.libs;

public class BirthdayException extends Exception {
    public BirthdayException() {
        super("The year of birth must be over 1900 & lower 18 years than current time, follows format dd/MM/yyyy.");
    }

    public BirthdayException(String message) {
        super(message);
    }
}
