package salarycalc;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int wage, hoursPerWeek, weeksPerYear;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter hourly wage: ");
        wage = scnr.nextInt();
        System.out.print("Enter hours worked per week: ");
        hoursPerWeek = scnr.nextInt();
        System.out.print("Enter weeks worked per year: ");
        weeksPerYear = scnr.nextInt();
        System.out.print("Salary is $");
        System.out.print(wage * hoursPerWeek * weeksPerYear);
        scnr.close();
    }
}