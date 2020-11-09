package s11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.Comparator;

public class AmountComparator implements Comparator<Product> {
    public boolean choose;

    public AmountComparator(boolean choose) {
        this.choose = choose;
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (this.choose){
            if(o1.getAmount() > o2.getAmount()){
                return 1;
            }else if(o1.getAmount() == o2.getAmount()){
                return 0;
            }else{
                return -1;
            }
        } else {
            if(o1.getAmount() < o2.getAmount()){
                return 1;
            }else if(o1.getAmount() == o2.getAmount()){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
