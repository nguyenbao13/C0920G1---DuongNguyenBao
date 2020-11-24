package case_study_furama_resort.models;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Cinema4d {
    public static void main(String[] args) {
        Customer customer1 = new Customer("A Nguyen", "30/04/1975", "male", "123 345 456",
                "09121314", "aaa@gmail.com", "vip", "dongda");
        Customer customer2 = new Customer("B Nguyen", "30/04/1975", "male", "123 345 456",
                "09121314", "aaa@gmail.com", "vip", "dongda");
        Queue<Customer> list = new ArrayDeque<Customer>();
        list.offer(customer1);
        list.offer(customer2);
        for(Customer c : list) {
            System.out.println(c);
        }
    }
}
