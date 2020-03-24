package homework7;

import homework6.Species;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(Species species, String nickName, int age, int trickLevel, String[] habit, Family family) {
        super(species, nickName, age, trickLevel, habit, family);
    }

    @Override
    public void respond() {
        System.out.println("havhav");
    }
}
