package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketCapacity) {
        setName(name);
        setColor(color);
        this.bucketCapacity = bucketCapacity;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + getName() + " with bucket capacity of "
                + bucketCapacity + " liters is working.");
    }
}
