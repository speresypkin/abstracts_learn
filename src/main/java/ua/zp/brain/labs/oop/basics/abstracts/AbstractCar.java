package ua.zp.brain.labs.oop.basics.abstracts;

public abstract class AbstractCar extends AbstractTransport{

    private int seatsCount;
    private final String transmission;
    private final String type;


    public AbstractCar(String name, String engine, String transmission, String type) {
        super(name, engine);
        this.transmission = transmission;
        this.type = type;
        fillUpFuel(50);
    }

    public void run(int speed) {
        System.out.println("Едим со скоростью: " + speed + " на " + getName());
    }

    public void stop() {
        System.out.println("Тормозим на " + getName());
    }

    protected abstract void fillUpFuel(int count);

    @Override
    protected boolean startStopEngine() {
        if(isEngineRun()){
            System.out.println("Глушим двигатель на " + getName());
            setEngineRun(false);
        } else {
            System.out.println("Запускаем двигатель на " + getName());
            setEngineRun(true);
        }
        return isEngineRun();

    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }

    public final String getTransmission() {
        return transmission;
    }

    public final String getType() {
        return type;
    }
}
