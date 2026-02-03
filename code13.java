class Employee {
    private double salary;

    void setSalary(double s) {
        if (s >= 0) salary = s;
    }

    double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setSalary(5000);   // valid
        System.out.println("Salary: " + e.getSalary());

        e.setSalary(-1000);  // invalid, ignored
        System.out.println("Salary: " + e.getSalary());
    }
}
