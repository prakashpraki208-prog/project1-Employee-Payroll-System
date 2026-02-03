class Car {
    String brand;
    String model;
    int price;

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Corolla";
        c.price = 1500000;

        System.out.println("Brand: " + c.brand);
        System.out.println("Model: " + c.model);
        System.out.println("Price: " + c.price);
    }
}
