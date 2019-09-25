package ua.zp.brain.labs.oop.basics.abstracts;

public class Bus extends AbstractCar implements Drivable{

    private String travelType;
    private boolean hasToilet;

    public Bus(String name, String engine, String transmission) {
        super(name, engine, transmission, "Фургон");
    }

    @Override
    protected void fillUpFuel(int count) {
        System.out.println("Заливаем бенз из канистры");
    }

    public boolean isHasToilet() {
        return hasToilet;
    }

    public void setHasToilet(boolean hasToilet) {
        this.hasToilet = hasToilet;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }


    @Override
    public void run(int speed) {
        super.run(speed);
        System.out.println("Едим аккуратно, у нас пасажиры");
    }

    @Override
    public void drive(Driver driver) {
        System.out.println(driver.getName() + " за рулем автобуса");
    }

    @Override
    public String printExperience(Driver driver) {
        return "Водитель АВТОБУСА " + driver.getName() + " имеет " +
                driver.getExperience() + " лет опыта";
    }
}
