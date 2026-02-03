class Rectangle {
    int length;
    int width;

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;

        System.out.println("Area: " + (r.length * r.width));
        System.out.println("Perimeter: " + (2 * (r.length + r.width)));
    }
}
