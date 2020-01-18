package Main;

public class Main {

    public static void main(String[] args) {

        Object [] animals = new Object [10];

        animals[0] = new Dog(1, 2, 6, "green", "Bobik", true);
        animals[1] = new Guidedog(2, 2, 6, "green",  "Tuzik", true, true);
        animals[2] = new Wolf( 3,4,5,"grey");
        animals[3] = new Cat(4,12,45,"red","Barsick",true);
        animals[4] = new Crocodile(5,10,55.5,"green");
        animals[5] = new Giraffe(6,12,150,"yellow");
        animals[6] = new Fish(7,1,0.50, "gold","Goldie");
        animals[7] = new Hamster(8,1,0.10,"grey","Homka",false);
        animals[8] = new Pet(9,5,100,"purple","Nameless Nasty Slime",false);
        animals[9] = new WildAnimal(10,300,500,"black",true);


        for (int i = 0; i < animals.length; i++) {
            System.out.println(((Animal) animals[i]).voice());
        }
        System.out.println(((WildAnimal) animals[2]).getPredator());
        System.out.println(((Pet) animals[8]).getVaccinated());

    }

}