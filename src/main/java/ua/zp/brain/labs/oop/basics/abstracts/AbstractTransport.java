package ua.zp.brain.labs.oop.basics.abstracts;

public abstract class AbstractTransport {

    private String name;
    private String engine;
    private boolean isEngineRun;

    public AbstractTransport(String name, String engine) {
        this.name = name;
        this.engine = engine;
        startStopEngine();
    }

    protected abstract boolean startStopEngine();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isEngineRun() {
        return isEngineRun;
    }

    public void setEngineRun(boolean engineRun) {
        isEngineRun = engineRun;
    }
}
