package s11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ManagerProductArrayList extends Product {
    public static int count = 0;
    public static List<Product> list = new ArrayList<>();
    public ManagerProductArrayList() {
    }

    public ManagerProductArrayList(int id, String name, int amount) {
        super(id, name, amount);
    }

    public void addProduct(){
        setId(++count);
        setName(inputName());
        setAmount(inputAmount());
        Product product = new Product(getId(),getName(),getAmount());
        list.add(product);
        System.out.println("Added Successfully!");
    }
    public String inputName(){
        System.out.println("Enter name: ");
        return Main.getInput().nextLine();
    }
    public int inputAmount(){
        System.out.println("Enter amount: ");
        return Main.getInput().nextInt();
    }
    public void displayProduct(){
        for (Product p : list) {
            System.out.println("ID : " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Amount: " + p.getAmount());
            System.out.println("\n ---------------------------------");
        }
    }
    public  void removeProduct(){
        System.out.println("Enter the ID of removing product: ");
        int id = Main.getInput().nextInt();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                list.remove(i);
                System.out.println("Removed Successfully!");
            } else {
                System.out.println("Product is not exist!");
            }
        }
    }

    public void searchProduct(){
        boolean check = false;
        System.out.println("Enter the product to search: ");
        String  name = Main.getInput().nextLine();
        for (Product p : list){
            if (p.getName().equals(name)) {
                System.out.println("ID " + p.getId() +
                        "\n Tên: " + p.getName() +
                        "\n Số lượng: " + p.getAmount());
                check = true;
            }
        } if (!check){
            System.out.println("No searching product!");
        }
    }

    public void sortProductMinToMax(){
        AmountComparator amountComparator = new AmountComparator(true);
        Collections.sort(list, amountComparator);
        System.out.println("Min to Max Sorted!");
    }
    public void sortProductMaxToMin(){
        AmountComparator amountComparator = new AmountComparator(false);
        Collections.sort(list, amountComparator);
        System.out.println("Max to Min Sorted!");
    }
    public void editProduct(){
        boolean check = false;
        System.out.println("Enter the ID to edit: ");
        int id = Main.getInput().nextInt();
        for (Product p : list){
            if (p.getId() == id){
                System.out.println("Retype the name: ");
                p.setName(Main.getInput().nextLine());
                System.out.println("Retype the amount: ");
                p.setAmount(Main.getInput().nextInt());
                System.out.println("Edited Successfully!");
                check = true;
            }
        } if (!check){
            System.out.println("No searching product!");
        }
    }
}
