class Product {
    private double price;
    private int stock;

    void setPrice(double p) {
        if (p > 0) price = p;
    }

    void setStock(int s) {
        if (s >= 0) stock = s;
    }

    double getPrice() { return price; }
    int getStock() { return stock; }

    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(500);
        p.setStock(10);
        System.out.println("Price: " + p.getPrice() + ", Stock: " + p.getStock());
    }
}
