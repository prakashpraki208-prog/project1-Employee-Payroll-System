class Circle {
    double radius;

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        System.out.println("Area: " + (3.14 * c.radius * c.radius));
    }
}
