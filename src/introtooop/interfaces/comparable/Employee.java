package introtooop.interfaces.comparable;

public class Employee implements Comparable<Employee>{
    String name;
    Integer age;
    Integer employee_id;
    double salary;

    public Employee(String name, int age, int employee_id, double salary) {
        this.name = name;
        this.age = age;
        this.employee_id = employee_id;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        int last = this.age.compareTo(employee.age);
        return last == 0 ? this.employee_id.compareTo(employee.employee_id) : last;
    }

    @Override
    public String toString() {
        return this.name + "\n\tAge: " + this.age + "\n\tEmployee Id: " + this.employee_id + "\n\tSalary: " + this.salary;
    }
}
