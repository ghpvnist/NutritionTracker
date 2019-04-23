public abstract class Person {
    String name;
    double weight;
    double height;
    int age;
    Tracker tracker;

    public Person() {
        this.name = "Unnamed";
        this.weight = 0.0;
        this.height = 0.0;
        this.age = 0;
        this.tracker = new Tracker();
    }

    public Person(String name, double weight, double height, int age, Tracker tracker) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.tracker = tracker;
    }

    abstract double calculateBMI();

    public Tracker getTracker() {
        return tracker;
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

    public String toString() {
        String s = "";
        s += "Name: " + name;
        s += "\nWeight: " + weight;
        s += "\nHeight: " + height;
        s += "\nAge: " + age;
        return s;
    }
}
