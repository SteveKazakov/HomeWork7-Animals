package Main;

public class Dog extends Pet {

    public Dog(int id, int age, float weigh, String color, String name, boolean isVaccinated) {
        super(id, age, weigh, color, name, isVaccinated);
    }
    public String voice() {
        return  "Hello, my name is " + name + " Woof! MF! Woof!";

    }
}
