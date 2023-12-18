class Boat extends Vehicle implements Swimmable {
    int maxSpeed;
    boolean isSailing;

    Boat(int id, String brand, String model, int year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
    }

    @Override
    void startEngine() {
        System.out.println("Мотор лодки запущен");

    }

    @Override
    void stopEngine() {
        System.out.println("Мотор лодки остановлен");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Скорость лодки " + speed + " узлов");
    }

    @Override
    void brake() {
        System.out.println("Лодка замедляет ход");
    }

    @Override
    public void startSwimming() {
        System.out.println("Начало движения лодки по воде");
        isSailing = true;
    }

    @Override
    public void stopSwimming() {
        System.out.println("Прекращение движения лодки по воде");
        isSailing = false;
    }

    @Override
    void displayInfo() {
        System.out.println("Лодка: " + brand + " " + model + " (" + year + ")");
    }
}