package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladeType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bladeType) {
        setName(name);
        setColor(color);
        this.bladeType = bladeType;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getName() + " with " + bladeType + " blade is working.");
    }
}
