class Mobile {
    String brand;
    int batteryPercentage;

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "Samsung";
        m.batteryPercentage = 50;

        // Charge battery
        m.batteryPercentage = m.batteryPercentage + 30;
        if (m.batteryPercentage > 100) m.batteryPercentage = 100;
        System.out.println("Battery after charging: " + m.batteryPercentage + "%");

        // Use battery
        m.batteryPercentage = m.batteryPercentage - 20;
        if (m.batteryPercentage < 0) m.batteryPercentage = 0;
        System.out.println("Battery after use: " + m.batteryPercentage + "%");
    }
}
