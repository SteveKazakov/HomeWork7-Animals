package Main;

public class Fish extends Pet {

    public Fish(int id, int age, double weigh, String color, String name) {
        super(id, age, weigh, color, name, false);
    }

    public String voice() {
        return "....";
    }



}
