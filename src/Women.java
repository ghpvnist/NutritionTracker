import java.io.Serializable;

public class Women extends Person implements Serializable {
    private String name;
    private double weight;
    private double height;
    private int age;
    private Tracker tracker;

    public Women() {
        this("Women", 0, 0, 0, new Tracker());
    }

    public Women(String name, double weight, double height, int age, Tracker tracker) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.tracker = tracker;
    }

    public double calculateBEE() {
        return 655.0955 + (9.5634 * this.weight) + (1.8496 * this.height) - (4.6756 * this.age);
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
        s += "Name: " + this.name + " female";
        s += "\nWeight: " + this.weight;
        s += "\nHeight: " + this.height;
        s += "\nAge: " + this.age;
        return s;
    }
}
