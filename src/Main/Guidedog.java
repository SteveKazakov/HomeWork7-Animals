package Main;

public class Guidedog extends Pet {
    private boolean isTrained;

    public boolean isTrained() {
        return isTrained;
    }

    public Guidedog(int id, int age, double weigh, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weigh, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public String getTrained() {
        if (isTrained = true) {
            return "This dog understands commands to sit, voice, and also knows about inheritance and polymorphism.";
        } else {
            return "This dog can eat your legs! And no one can tell FUU. Beware!";
        }
    }
    public String voice() {
        return  "Hello, my name is " + name + " I can take you home even you drunk as a F***.";

    }
}
