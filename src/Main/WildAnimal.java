package Main;

public class WildAnimal extends Animal {
    public boolean isPredator;

    public WildAnimal(int id, int age, double weigh, String color, boolean isPredator) {
        super(id, age, weigh, color);
        this.isPredator = isPredator;
    }

    public void setPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }

    public String getPredator() {
        if (isPredator = true) {
            return "Aggressive like your ex-girlfriend";
        } else {
            return "Kind and fluffy";
        }
    }

    public String voice() {
        if (isPredator)
            return  "I am a wild animal and I am angry";
        else
            return  "I am a wild animal";
        }



    }
