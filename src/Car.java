class Car extends Vehicle {
    int fuelCapacity;
    int currentFuelLevel;

    Car(int id, String brand, String model, int year, int fuelCapacity) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = fuelCapacity;
    }

    @Override
    void startEngine() {
        System.out.println("Запуск двигателя автомобиля");
    }

    @Override
    void stopEngine() {
        System.out.println("Остановка двигателя автомобиля");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Скорость автомобиля " + speed + " Км/ч");
    }

    @Override
    void brake() {
        System.out.println("Торможение автомобиля");
    }

    void refuel(int liters) {
        currentFuelLevel += liters;
        System.out.println("Заправка автомобиля " + liters + " литров");
    }

    @Override
    void displayInfo() {
        System.out.println("Автомобиль: " + brand + " " + model + " (" + year + ")");
    }
}