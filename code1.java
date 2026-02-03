class Student {
    String name;
    int age;
    int marks;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.marks = 90;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Marks: " + s1.marks);

        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Marks: " + s2.marks);
    }
}
