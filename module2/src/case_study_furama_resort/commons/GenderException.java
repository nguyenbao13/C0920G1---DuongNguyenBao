package case_study_furama_resort.commons;

public class GenderException extends Exception {
    public GenderException() {
        super("Không thuộc các loại giới tính.");
    }

    public GenderException(String message) {
        super(message);
    }
}
