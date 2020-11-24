package case_study_furama_resort.libs;

public class EmailException extends Exception {
    public EmailException() {
        super("Email must follow format Employees@Employees.Employees");
    }

    public EmailException(String message) {
        super(message);
    }
}
