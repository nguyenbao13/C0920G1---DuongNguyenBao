package case_study_furama_resort.commons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Validate {
    public static boolean idVillaCheck (String string) {
        String regex = "^SVVL-\\d{4}$";
        return Pattern.matches(regex, string);
    }
    public static boolean idHouseCheck (String string) {
        String regex = "^SVHO-\\d{4}$";
        return Pattern.matches(regex, string);
    }
    public static boolean idRoomCheck (String string) {
        String regex = "^SVRO-\\d{4}$";
        return Pattern.matches(regex, string);
    }

    public static boolean serviceNameCheck (String string) { //Same as rentType, roomStandard
        String regex = "^[A-Z][a-z]+$";
        return Pattern.matches(regex, string);
    }

    public static boolean areaCheck (String string) {
        String regex = "^(30\\.?\\d*[1-9]+\\d*|3[1-9]\\.?\\d*|[4-9]\\d+\\.?\\d*|[1-9]\\d{2,}\\.?\\d*)$";
        return Pattern.matches(regex, string);
    }

    public static boolean rentCostCheck (String string) {
        String regex = "^(0\\.\\d*[1-9]+\\d*|[1-9]\\d*\\.?\\d*)$";
        return Pattern.matches(regex, string);
    }

    public static boolean amountMaxCheck (String string) {
        String regex = "^([1-9]|1\\d?)$";
        return Pattern.matches(regex, string);
    }

    public static boolean freeServiceCheck (String string) {
        String regex = "^(massage|karaoke|food|drink|car)$";
        return Pattern.matches(regex, string);
    }

    public static boolean floorsCheck (String string) {
        String regex = "^[1-9]\\d*$";
        return Pattern.matches(regex, string);
    }

    public static void nameCustomerCheck(String string) throws NameException {
        String regex = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]" +
                "([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)[ ])+" +
                "[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]" +
                "([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)$";
        if(!Pattern.matches(regex, string)) {
            throw new NameException();
        }
    }

    public static void emailCheck(String string) throws EmailException {
        String regex = "^[a-z]{3,}@[a-z]{2,}(\\.[a-z]{2,})+$";
        if(!Pattern.matches(regex, string)) {
            throw new EmailException();
        }
    }

    public static void genderCheck(String string) throws GenderException {
        String regex = "^([Mm][Aa][Ll][Ee]|[Ff][Ee][Mm][Aa][Ll][Ee]|[Uu][Nn][Kk][Nn][Oo][Ww][Nn])$";
        if(!Pattern.matches(regex, string)) {
            throw new GenderException();
        }
    }

    public static void idCardNumberCheck(String string) throws IdCardException {
        String regex = "^\\d{3}(\\s\\d{3}){2}$";
        if(!Pattern.matches(regex, string)) {
            throw new IdCardException();
        }
    }

    public static void birthdayCheck (String string) throws BirthdayException {
//        Date date = new Date();
//        SimpleDateFormat Formatter = new SimpleDateFormat("dd/mm/yyyy");
//        String stringDate = Formatter.format(date);
        String regex = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/]" +
                "(0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/]([2-9][0-9]\\d\\d|19\\d[1-9])$)|" +
                "(^29[\\/]02[\\/]([2-9][0-9](00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|" +
                "19(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96))$)";
        if(!Pattern.matches(regex, string) ) {

        }
    }
}
