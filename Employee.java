
public class Employee {

    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}
class SalesEmployee extends Employee {

    double bonus;
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
class Main {

    public static void main(String[] args) {

        SalesEmployee se = new SalesEmployee();

        se.baseSalary = 20000;
        se.bonus = 5000;

        System.out.println("Base Salary: " + se.baseSalary);
        System.out.println("Bonus: " + se.bonus);
        System.out.println("Total Salary: " + se.calculateSalary());
    }
}
