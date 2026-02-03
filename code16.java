class Mobile {
    private int battery;

    void charge(int amt) {
        battery += amt;
        if (battery > 100) battery = 100;
    }

    void use(int amt) {
        battery -= amt;
        if (battery < 0) battery = 0;
    }

    int getBattery() {
        return battery;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.charge(50);
        m.use(20);
        System.out.println("Battery: " + m.getBattery());
    }
}
