package ua.zp.brain.labs.oop.basics.abstracts;

import java.util.Random;

public class Main {

    public static final String DIESEL_ENGINE = "Дизельный";
    public static final String GAS_ENGINE = "Бинзиновый";

    public static final String MANUAL_TRANSMISSION = "Ручная";
    public static final String AUTO_TRANSMISSION = "Автомат";

    public static final String SEDAN_BODY = "Седан";


    public static void main(String[] args) {
        Driver misha = new Driver("Миша Шумахер", 700);
        Bus bus = new Bus("Икарус", DIESEL_ENGINE, MANUAL_TRANSMISSION);
        SportCar raceCar = new SportCar("BMW 320M", DIESEL_ENGINE, MANUAL_TRANSMISSION, SEDAN_BODY);
        Bus schoolBus = new SchoolBus("Спринтер", GAS_ENGINE, AUTO_TRANSMISSION);
        Bicycle bicycle = new Bicycle("BMX 777");
        runAll(bus,raceCar,schoolBus);
        driveAll(misha, bus, bicycle, schoolBus);
    }

    public static void runAll(AbstractCar ...cars){
        for (AbstractCar car: cars) {
            int randomSpeed = new Random().nextInt(200);
            System.out.println();
            car.run(randomSpeed);
            car.stop();
        }
    }

    public static void driveAll(Driver driver, Drivable ...drivables){
        for (Drivable drivable: drivables) {
            drivable.drive(driver);
            System.out.println(drivable.printExperience(driver));
        }
    }
}
