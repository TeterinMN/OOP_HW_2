class Aircraft extends Vehicle implements Flyable {
    int maxAltitude;
    boolean isFlying;

    Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }

    @Override
    void startEngine() {
        System.out.println("Двигатели самолёта запущены");
    }

    @Override
    void stopEngine() {
        System.out.println("Двигатели самолёта остановлены");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Скорость самолёта " + speed + " Км/ч");
    }

    @Override
    void brake() {
        System.out.println("Самолёт замедляет ход");
    }

    @Override
    public void takeOff() {
        System.out.println("Взлёт самолёта");
        isFlying = true;
    }

    @Override
    public void land() {
        System.out.println("Посадка самолёта");
        isFlying = false;
    }

    @Override
    void displayInfo() {
        System.out.println("Самолёт: " + brand + " " + model + " (" + year + ")");
    }
}