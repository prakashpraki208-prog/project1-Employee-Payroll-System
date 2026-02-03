class Voter {
    private int age;

    void setAge(int a) {
        if (a > 0) age = a;
    }

    boolean isEligible() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Voter v = new Voter();
        v.setAge(20);
        System.out.println("Eligible: " + v.isEligible());
    }
}
