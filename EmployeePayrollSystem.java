import java.util.Scanner;

// Abstract base class
.



abstract class Employee {
    protected String name;
    protected double baseSalary;
    
    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    // Abstract method - must be overridden by subclasses
    public abstract double calculateSalary();
    
    // Concrete method - common to all employees
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());  // Polymorphism here!
    }
}

// Developer class extending Employee
class Developer extends Employee {
    private double projectBonusRate = 0.10;  // 10% bonus
    
    public Developer(String name, double baseSalary) {
        super(name, baseSalary);  // Using super keyword
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * projectBonusRate);
    }
    
    public String getRole() {
        return "Developer";
    }
}

// Manager class extending Employee
class Manager extends Employee {
    private double performanceBonusRate = 0.20;  // 20% bonus
    private double teamAllowance = 5000;
    
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * performanceBonusRate) + teamAllowance;
    }
    
    public String getRole() {
        return "Manager";
    }
}

// Main class with console interface
public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Employee Payroll System ===");
        System.out.println("Select Employee Type:");
        System.out.println("1. Developer");
        System.out.println("2. Manager");
        System.out.print("Enter choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Base Salary: ");
        double baseSalary = scanner.nextDouble();
        
        // Input validation
        if (baseSalary <= 0) {
            System.out.println("Error: Base salary must be positive!");
            scanner.close();
            return;
        }
        
        // Runtime Polymorphism - Employee reference, concrete object
        Employee emp;
        if (choice == 1) {
            emp = new Developer(name, baseSalary);
        } else if (choice == 2) {
            emp = new Manager(name, baseSalary);
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }
        
        // Dynamic Method Dispatch - calculateSalary() called based on OBJECT type, not reference type
        System.out.println("\n=== Payroll Details ===");
        System.out.println("Role: " + ((choice == 1) ? ((Developer)emp).getRole() : ((Manager)emp).getRole()));
        emp.displayDetails();  // This calls the overridden method automatically!
        
        scanner.close();
    }
}
