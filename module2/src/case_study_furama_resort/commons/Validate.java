package case_study_furama_resort.commons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Validate {
    public static boolean serviceCodeCheck (String string) {
        String regex = "^SV(VL|HO|RO)-\\d{4}$";
        return Pattern.matches(regex, string);
    }
    public static boolean serviceNameCheck (String string) { //Same as rentType, roomStandard
        String regex = "^[A-Z][a-z]+$";
        return Pattern.matches(regex, string);
    }
    public static boolean areaCheck (double area) {
        if(area > 30) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean rentCostCheck (double cost) {
        if(cost > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean amountMaxCheck (int amount) {
        if(amount > 0 && amount < 20) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean freeServiceCheck (String string) {
        String regex = "^(massage|karaoke|food|drink|car)$";
        return Pattern.matches(regex, string);
    }
    public static boolean floorsCheck (int floors) {
        if(floors > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean birthdayCheck (String string) {
//        Date date = new Date();
//        SimpleDateFormat Formatter = new SimpleDateFormat("dd/mm/yyyy");
//        String stringDate = Formatter.format(date);
        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
                "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^" +
                "(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|" +
                "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
                "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        return Pattern.matches(regex, string);
    }
}
