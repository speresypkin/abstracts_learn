package ua.zp.brain.labs.oop.basics.abstracts;

public class Driver {
    private String name;
    private int experience;

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}
