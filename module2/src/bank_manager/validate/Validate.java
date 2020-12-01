package bank_manager.validate;

import java.util.regex.Pattern;

public class Validate {
    public static final String REGEX_IDBOOK = "^STK-\\d{4}$";
    public static final String REGEX_DATE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|" +
            "((29|30)[\\/](0[4,6,9]|11)))[\\/]([2-9][0-9]\\d\\d|19\\d[1-9])$)|(^29[\\/]02[\\/]((19|[2-9][0-9])" +
            "(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|[2-9][0-9]00)$)";
    public static final String REGEX_SHORTTERM = "^6|3$";
    public static final String REGEX_LONGTERM = "^1|3|5|10$";
    public static final String REGEX_MONEY = "^[1-9]\\d{6,}$";
    public static final String REGEX_NAMECUSTOMER = "^\\w+$";
    public static final String REGEX_GENDER = "^\\w+$";
    public static final String REGEX_PHONENUMBER = "^\\w+$";
    public static final String REGEX_ADDRESS = "^\\w+$";
    public static final String REGEX_INTEREST = "^\\w+$";
    public static final String REGEX_BONUS = "^\\w+$";
    //public static final String idCustomer;
    public static boolean idBookCheck(String string) {
        return Pattern.matches(REGEX_IDBOOK, string);
    }
    public static boolean dateCheck(String string) {
        return Pattern.matches(REGEX_DATE, string);
    }
    public static boolean shortTermCheck(String string) {
        return Pattern.matches(REGEX_SHORTTERM, string);
    }
    public static boolean longTermCheck(String string) {
        return Pattern.matches(REGEX_LONGTERM, string);
    }
    public static boolean moneyCheck(String string) {
        return Pattern.matches(REGEX_MONEY, string);
    }
    public static boolean nameCustomerCheck(String string) {
        return Pattern.matches(REGEX_NAMECUSTOMER, string);
    }
    public static boolean genderCheck(String string) {
        return Pattern.matches(REGEX_GENDER, string);
    }
    public static boolean phoneNumberCheck(String string) {
        return Pattern.matches(REGEX_PHONENUMBER, string);
    }
    public static boolean addressCheck(String string) {
        return Pattern.matches(REGEX_ADDRESS, string);
    }
    public static boolean interestCheck(String string) {
        return Pattern.matches(REGEX_INTEREST, string);
    }
    public static boolean bonusCheck(String string) {
        return Pattern.matches(REGEX_BONUS, string);
    }

}
