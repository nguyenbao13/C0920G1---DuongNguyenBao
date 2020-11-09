package s10_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Stack;

public class BracketCheckByStack {
    public static void main(String[] args) {
        Stack bStack = new Stack();
        String sym = "s * (s – a) * (s – b) * (s – c)";
        boolean check = true;
        for(int i = 0; i < sym.length(); i++) {
            if(sym.charAt(i) == '(') {
                bStack.push(sym.charAt(i));
            } else if (sym.charAt(i) == ')') {
                if(!bStack.isEmpty()) {
                    bStack.pop();
                } else {
                    check = false;
                    break;
                }
            }

        }
        if (check && bStack.isEmpty()) {
            System.out.println("String is right format");
        } else {
            System.out.println("String is not in right format");
        }
    }
}
