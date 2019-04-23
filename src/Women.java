import java.io.Serializable;

public class Women extends Person implements Serializable {
    private String name;
    private double weight;
    private double height;
    private int age;
    private Tracker tracker;

    public Women() {
        super();
    }

    public Women(String name, double weight, double height, int age, Tracker tracker) {
        super(name, weight, height, age, tracker);
    }

    public double calculateBMI() {
        return 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }
}
