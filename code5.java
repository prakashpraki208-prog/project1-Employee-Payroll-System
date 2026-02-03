class Employee {
    String name;
    double basicSalary;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.basicSalary = 50000;

        double hra = emp.basicSalary * 0.2;  // 20% HRA
        double da = emp.basicSalary * 0.1;   // 10% DA
        double grossSalary = emp.basicSalary + hra + da;

        System.out.println("Employee: " + emp.name);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
