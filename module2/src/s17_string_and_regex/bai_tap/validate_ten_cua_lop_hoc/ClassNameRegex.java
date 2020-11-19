package s17_string_and_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Pattern;

public class ClassNameRegex {
    public static void main(String[] args) {
        String regex = "^[CAP]\\d{4}[GHIKLM]$";
        String str1 = "C0318G";
        String str2 = "M0318G";
        String str3 = "P0323A";
        System.out.println(Pattern.matches(regex, str1));
        System.out.println(Pattern.matches(regex, str2));
        System.out.println(Pattern.matches(regex, str3));
    }
}
