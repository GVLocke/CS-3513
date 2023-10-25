package introtooop.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("John Doe", 25, 1002, 50000.0));
        employees.add(new Employee("Jane Smith", 30, 1004, 60000.0));
        employees.add(new Employee("Bob Johnson", 35, 1003, 70000.0));
        employees.add(new Employee("Alice Williams", 35, 1010, 80000.0));
        employees.add(new Employee("Tom Brown", 45, 1099, 90000.0));
        employees.add(new Employee("Samantha Lee", 50, 1084, 100000.0));
        employees.add(new Employee("David Kim", 55, 1009, 110000.0));
        employees.add(new Employee("Emily Chen", 60, 1001, 120000.0));
        employees.add(new Employee("Michael Davis", 65, 1000, 130000.0));
        employees.add(new Employee("Olivia Wilson", 70, 1010, 140000.0));
        Collections.sort(employees);
        for (Employee str:employees) {
            System.out.println(str);
        }
    }
}
