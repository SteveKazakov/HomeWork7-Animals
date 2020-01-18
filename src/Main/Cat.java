package Main;

public class Cat extends Pet {

    public Cat(int id, int age, double weigh, String color, String name, boolean isVaccinated) {
        super(id, age, weigh, color, name, isVaccinated);
    }

    public String voice() {
        return  "Hello, my name is " + name + " Meow! Pur-pur-puur!";

    }
}