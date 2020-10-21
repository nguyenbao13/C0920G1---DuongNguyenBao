package s1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = Double.valueOf(sc.nextLine());
        double convert = usd * 23000;
        System.out.print("Đổi thành tiền VND: " + convert);
    }
}
