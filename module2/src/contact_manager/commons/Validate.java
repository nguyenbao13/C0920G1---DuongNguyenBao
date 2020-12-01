package contact_manager.commons;

import java.util.regex.Pattern;

public class Validate {
    public static final String NAME_REGEX = "^([A-Z][a-z]+\\s)*([A-Z][a-z]+)$";
    public static final String GENDER_REGEX = "^(Male|Female|Unknown)$";
    public static final String GROUP_REGEX = "^\\w+$";
    public static final String PHONE_NUMBER_REGEX = "^\\d{9}$";
    public static final String ADDRESS_REGEX = "^\\d+(\\s\\w+)+$";
    public static final String NUMBER_REGEX = "^[1-9]+0*$";
    public static final String EMAIL_REGEX = "^\\w+@\\w+(\\.\\w+)+$";
    public static boolean nameCheck(String str) {
        return Pattern.matches(NAME_REGEX, str);
    }
    public static boolean genderCheck(String str) {
        return Pattern.matches(GENDER_REGEX, str);
    }
    public static boolean groupCheck(String str) {
        return Pattern.matches(GROUP_REGEX, str);
    }
    public static boolean phoneNumberCheck(String str) {
        return Pattern.matches(PHONE_NUMBER_REGEX, str);
    }
    public static boolean addressCheck(String str) {
        return Pattern.matches(ADDRESS_REGEX, str);
    }
}
