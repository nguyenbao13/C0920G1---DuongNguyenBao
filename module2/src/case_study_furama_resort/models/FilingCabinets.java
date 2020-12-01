package case_study_furama_resort.models;

import case_study_furama_resort.commons.FileUtils;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static void SearchEmployee() {
        Stack<Employee> employeeStack = new Stack<>();
        List<String> listEmployee = FileUtils.readFile("src/case_study_furama_resort/data/Employees");
        String[] strings;
        Employee employee;
        for (String e : listEmployee) {
            strings = e.split(", ");
            employee = new Employee(strings[0], strings[1], strings[2]);
            employeeStack.push(employee);
        }
        String search;
        Scanner scanner = new Scanner(System.in);
        System.out.println("LIST NAME EMPLOYEE.");
        for (Employee e : employeeStack) {
            System.out.println(e.getNameEmployee());
        }
        System.out.println("Enter the employee you want to search: ");
        search = scanner.nextLine();
        boolean check = false;
        for (Employee e : employeeStack) {
            if (search.equals(e.getNameEmployee())) {
                System.out.println("Name: " + e.getNameEmployee() + ", Age: " + e.getAgeEmployee() + ", Address: " + e.getAddressEmployee());
              //System.out.println(employeeStack.push(e));
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.println("There is no such employee in the filing cabinet.");
        }
    }
}

