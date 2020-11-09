package s11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ManagerProductArrayList product = new ManagerProductArrayList();
        boolean check = true;
        do {
            System.out.println(" 1. Add new product." +
                    "\n 2. Display product(s)." +
                    "\n 3. Edit product by ID." +
                    "\n 4. Remove product by ID." +
                    "\n 5. Search product by ID." +
                    "\n 6. Sort product from min to max." +
                    "\n 7. Sort product from max to min." +
                    "\n 8. Exit." +
                    "\n Enter a number: ");
            switch (getInput().nextInt()){
                case 1:{
                    product.addProduct();
                    break;
                }
                case 2:{
                    product.displayProduct();
                    break;
                }
                case 3:{
                    product.editProduct();
                    break;
                }
                case 4:{
                    product.removeProduct();
                    break;
                }
                case 5:{
                    product.searchProduct();
                    break;
                }
                case 6:{
                    product.sortProductMinToMax();
                    break;
                }
                case 7:{
                    product.sortProductMaxToMin();
                    break;
                }
                case 8:{
                    check = false ;
                    break;
                }
            }
        }
        while (check);
    }
    public static Scanner getInput(){
        Scanner input = new Scanner(System.in);
        return input;
    }
}
