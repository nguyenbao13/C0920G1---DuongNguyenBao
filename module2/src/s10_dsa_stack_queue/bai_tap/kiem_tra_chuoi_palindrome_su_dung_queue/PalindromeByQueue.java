package s10_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeByQueue {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi cần kiểm tra:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String temp = inputString.toLowerCase();
        Queue queue = new ArrayDeque();
        for (int i = temp.length()-1; i >=0; i--) {
            queue.add(temp.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        if (temp.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
