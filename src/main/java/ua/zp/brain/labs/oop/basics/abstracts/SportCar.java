package ua.zp.brain.labs.oop.basics.abstracts;

public class SportCar extends AbstractCar{

    private int acceleration;

    public SportCar(String name, String engine, String transmission, String type) {
        super(name, engine, transmission, type);
    }

    public void wheelsPrepare(){
        System.out.println("Ставим на ручник");
        System.out.println("Газуем, что есть дури");
    }

    @Override
    protected void fillUpFuel(int count) {
        System.out.println("Заправка на питстопе");
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }
}
