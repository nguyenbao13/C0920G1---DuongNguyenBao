package case_study_furama_resort.commons;

import case_study_furama_resort.models.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getNameCustomer().equals(o2.getNameCustomer())){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = simpleDateFormat.parse(o1.getBirthday());
                date2 = simpleDateFormat.parse(o2.getBirthday());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (date1.compareTo(date2) == 0){
                return o1.getNameCustomer().compareTo(o2.getNameCustomer());
            }else {
                return date1.compareTo(date2);
            }
        }
        return o1.getNameCustomer().compareTo(o2.getNameCustomer());
    }
}
