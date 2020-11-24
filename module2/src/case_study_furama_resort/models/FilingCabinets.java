package case_study_furama_resort.models;

import java.util.Stack;

public class FilingCabinets {
    public static void main(String[] args) {
        Employee employee1 = new Employee("nguyen", "23", "haichau");
        Employee employee2 = new Employee("bao", "23", "thanhbinh");
        Stack<Employee> stack = new Stack();
        stack.add(employee1);
        stack.add(employee2);
        for(Employee e : stack) {
            System.out.println(e);
        }
    }
}
