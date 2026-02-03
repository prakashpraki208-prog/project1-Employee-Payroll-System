class College {
    String collegeName;
    String location;

    public static void main(String[] args) {
        College c1 = new College();
        c1.collegeName = "Oxford";
        c1.location = "UK";

        College c2 = new College();
        c2.collegeName = "MIT";
        c2.location = "USA";

        College c3 = new College();
        c3.collegeName = "IIT Bombay";
        c3.location = "India";

        // Printing details directly
        System.out.println(c1.collegeName + ", " + c1.location);
        System.out.println(c2.collegeName + ", " + c2.location);
        System.out.println(c3.collegeName + ", " + c3.location);
    }
}
