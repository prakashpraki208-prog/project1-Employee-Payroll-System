class Car {
    private int speed;

    void setSpeed(int s) {
        if (s >= 0 && s <= 200) speed = s;
    }

    int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(150);
        System.out.println("Speed: " + car.getSpeed());
    }
}
