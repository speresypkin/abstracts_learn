package ua.zp.brain.labs.oop.basics.abstracts;

public class SchoolBus extends Bus {

    private int schoolNumber;

    public SchoolBus(String name, String engine, String transmission) {
        super(name, engine, transmission);
        setHasToilet(false);
        setTravelType("Местный");
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

}
