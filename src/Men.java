import java.io.Serializable;

public class Men extends Person implements Serializable {
    private String name;
    private double weight;
    private double height;
    private int age;
    private Tracker tracker;

    public Men() {
        super();
    }

    public Men(String name, double weight, double height, int age, Tracker tracker) {
        super(name, weight, height, age, tracker);
    }

    public double calculateBMI() {
        return 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
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
