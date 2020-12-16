package customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private static List<Customer> list ;
    static {
        list = new ArrayList<>();
        list.add(new Customer("Duong", "1/1/1991", "123", "748334_drug_512x512.png"));
        list.add(new Customer("Nguyen", "2/1/1991", "123", "3463904.png"));
        list.add(new Customer("Bao", "1/3/1991", "123", "weed-icon-16x16-13.jpg"));
    }
    public static List<Customer> getCustomerList(){
        return list;
    }
}
