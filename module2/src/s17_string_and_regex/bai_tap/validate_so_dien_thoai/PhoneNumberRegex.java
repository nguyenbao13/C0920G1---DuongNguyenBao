package s17_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static void main(String[] args) {
        String regex = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
        String str1 = "(84)-(0978489648)";
        String str2 = "(a8)-(22222222)";
        String str3 = "P0323A";
        System.out.println(Pattern.matches(regex, str1));
        System.out.println(Pattern.matches(regex, str2));
        System.out.println(Pattern.matches(regex, str3));
    }
}
