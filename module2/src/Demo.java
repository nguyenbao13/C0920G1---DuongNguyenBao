import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String args[]) {
        //isCheckBirthday("13/08/2019");
    }
//    public static String isCheckBirthday(String birthday){
//        Scanner scanner = new Scanner(System.in);
//        final String REGEX_BIRTH = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
//        while (true) {
//            if (Pattern.matches(REGEX_BIRTH, birthday)) {
//                long currentTime = System.currentTimeMillis();
//                Date date = null;
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                try {
//                    date = simpleDateFormat.parse(birthday);
//
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//                assert date != null;
//                long millisecondsBirth =  date.getTime();
//                long millisecondsAge = currentTime - millisecondsBirth;
//                long rateMilliToYear = 60*60*24*365;
//                long age = millisecondsAge / (rateMilliToYear * 1000);//????????? đéo hiểu kiểu gì vcl
//                if (age >= 18){
//                    return birthday;
//                }
//                else {
//                    System.out.println("Nhap khong du 18 tuoi, hay nhap lai");
//                    birthday = scanner.nextLine();
//                }
//            } else {
//                System.out.println("Nhap khong dung dinh dang, hay nhap lai");
//                birthday = scanner.nextLine();
//            }
//        }
//    }
}
