package s2_vong_lap_trong_java.thuc_hanh.tinh_tien_lai_cho_vay;

public class InterestCalculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Money: ");
        money = Double.valueOf(input.nextLine());
        System.out.println("Time (month): ");
        month = Integer.valueOf(input.nextLine());
        System.out.println("Interest rate: ");
        interset_rate = Double.valueOf(input.nextLine());
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate / 100) / 12 * month;
        }
        System.out.println("Total interset: " + total_interset);
    }
}
