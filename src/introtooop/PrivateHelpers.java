package introtooop;
import java.util.Scanner;

class HRSection {
    public String name;
    public int id;
    public double grossSalary;
    public double netSalary;
    public double federalTax;
    public double stateTax;
    public double localTax;

    public HRSection(String name, int id, double grossSalary, double federalTax, double stateTax, double localTax) {
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
        this.federalTax = federalTax;
        this.localTax = localTax;
        this.stateTax = stateTax;
    }

    private double salaryCalculation() {
        double totalTax = federalTax + stateTax + localTax;
        double netSalary = grossSalary * (1 - totalTax);
        return netSalary;
    }

    public void displaySalary() {
        this.netSalary = salaryCalculation();
        System.out.print("Net salary is: $" + netSalary);
    }
}

public class PrivateHelpers { 
    public static void main(String[] args) throws Exception { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Employee name: ");
        String name = input.nextLine();
        System.out.print("Enter the Employee ID: ");
        int id = input.nextInt();
        System.out.print("Enter the Employee's gross salary: $");
        double grossSalary = input.nextDouble();
        System.out.print("Enter the federal tax: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter the state tax: ");
        double stateTax = input.nextDouble();
        System.out.print("Enter the local tax: ");
        double localTax = input.nextDouble();
        HRSection employee1 = new HRSection(name, id, grossSalary, federalTax, stateTax, localTax);
        employee1.displaySalary();
        input.close(); 
    } 
}