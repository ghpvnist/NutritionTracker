import java.io.Serializable;

public class Men extends Person implements Serializable {
    private String name;
    private double weight;
    private double height;
    private int age;
    private Tracker tracker;

    public Men() {
        this("Men", 0, 0, 0, new Tracker());
    }

    public Men(String name, double weight, double height, int age, Tracker tracker) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.tracker = tracker;
    }

    public double calculateBEE() {
        return 66.4730 + (13.7516 * this.weight) + (5.0033 * this.height) - (6.7550 * this.age);
    }

    double calculateBMI() {
        return this.weight / (this.height * this.height / 10000);
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


    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public String toString() {
        String s = "";
        s += "Name: " + this.name + " male";
        s += "\nWeight: " + this.weight;
        s += "\nHeight: " + this.height;
        s += "\nAge: " + this.age;
        return s;
    }
}
