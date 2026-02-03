class Student {
    private int marks;

    void setMarks(int m) {
        if (m >= 0 && m <= 100) marks = m;
    }

    int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setMarks(90);   // valid
        System.out.println("Marks: " + s.getMarks());

        s.setMarks(120);  // invalid, ignored
        System.out.println("Marks: " + s.getMarks());
    }
}
 
