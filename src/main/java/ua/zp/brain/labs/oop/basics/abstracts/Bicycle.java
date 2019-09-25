package ua.zp.brain.labs.oop.basics.abstracts;

public class Bicycle extends AbstractTransport implements Drivable {

    public static final String BICYCLE_ENGINE_TYPE = "Педали + цепь";

    public Bicycle(String name) {
        super(name, BICYCLE_ENGINE_TYPE);
    }

    @Override
    protected boolean startStopEngine() {
        if(isEngineRun()){
            System.out.println("Слазим с велика " + getName());
            setEngineRun(false);
        } else {
            System.out.println("Садимся на велик. Крутим педали. На " + getName());
            setEngineRun(true);
        }
        return isEngineRun();
    }

    @Override
    public void drive(Driver driver) {
        System.out.println(driver.getName() + "за рулем велика");
    }
}
