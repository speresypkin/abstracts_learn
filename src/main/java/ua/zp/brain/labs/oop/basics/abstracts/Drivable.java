package ua.zp.brain.labs.oop.basics.abstracts;

public interface Drivable {
    void drive(Driver driver);

    default String printExperience(Driver driver) {
        return "Водитель " + driver.getName() + " имеет " +
                driver.getExperience() + " лет опыта";
    }
}
