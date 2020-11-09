package s10_dsa_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binaryStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int number = scanner.nextInt();
        int temp = number;
        while(temp > 0) {
            binaryStack.push(temp%2);
            temp /= 2;
        }
        //Thêm mã nhị phân cuối cùng khi temp = 0
        binaryStack.push(temp%2);
//      In ra stack
//      System.out.println(binaryStack);
        System.out.println("Mã nhị phân của " + number + " là ");
        while(!binaryStack.isEmpty()){
            System.out.print(binaryStack.pop());
        }
    }
}
