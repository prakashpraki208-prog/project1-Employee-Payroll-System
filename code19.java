class Temperature {
    private double celsius;

    void setCelsius(double c) {
        if (c >= -273.15) celsius = c;
    }

    double getCelsius() { return celsius; }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(25);
        System.out.println("Temperature: " + t.getCelsius());
    }
}
