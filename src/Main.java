public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Тank", "500", 2023, 80);
        Aircraft aircraft = new Aircraft(2, "Boeing", "747", 2015, 35000);
        Boat boat = new Boat(3, "Yamaha", "242X", 2020, 45);

        car.startEngine();
        car.accelerate(80);
        car.brake();
        car.refuel(20);
        car.displayInfo();

        System.out.println();

        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.accelerate(850);
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayInfo();

        System.out.println();

        boat.startEngine();
        boat.startSwimming();
        boat.accelerate(25);
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayInfo();
    }
}