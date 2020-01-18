package Main;

public class Animal {
    public int id;
    public int age;
    public double weigh;
    public String color;

    public Animal(int id, int age, double weigh, String color) {
        super();
        this.id = id;
        this.age = age;
        this.weigh = weigh;
        this.color = color;
    }

    public Animal() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String voice() {
        return "Hello";
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", age=" + age + ", weigh=" + weigh + ", color=" + color + "]";
    }

}