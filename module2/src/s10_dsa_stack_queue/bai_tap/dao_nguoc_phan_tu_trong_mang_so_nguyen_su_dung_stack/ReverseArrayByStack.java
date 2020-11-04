package s10_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayByStack {
    public static void main(String[] args) {
        //Dao mang int
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};
        for (int element : arr) {
            stack.push(element);
        }
        System.out.println("Before reverse:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("After reverse:");
        System.out.println(Arrays.toString(arr));
        //Dao chuoi (String)
        Stack<String> wStack = new Stack<>();
        String string = "hello everybody here";
        String[] mWord = string.split(" ");
        for(String element : mWord) {
            wStack.push(element);
        }
        System.out.println("Before reverse:");
        System.out.println(string);
        string = "";
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
            string += mWord[i] + " ";
        }
        System.out.println("After reverse:");
        System.out.println(string);
    }
}
