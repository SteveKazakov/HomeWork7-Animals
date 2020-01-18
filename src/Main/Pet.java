package Main;

public class Pet extends Animal {
    private boolean isVaccinated;
    public String name;

    public Pet(int id, int age, double weigh, String color, String name, boolean isVaccinated) {
        super(id, age, weigh, color);
        this.isVaccinated = isVaccinated;
        this.name = name;
    }

    public void setVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public String getVaccinated() {
        if (isVaccinated) {
            return "You can touch this creature";
        } else {
            return "Danger!!! Risk of infection rabies, Ebola, dementia and diarrhea";
        }
    }
    public String voice() {
        return  "Hello, my name is " + name;

    }
}
