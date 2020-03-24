package homework7;

import homework6.Species;

public class RoboCat extends Pet {
    public RoboCat() {
    }

    public RoboCat(Species species, String nickName, int age, int trickLevel, String[] habit, Family family) {
        super(species, nickName, age, trickLevel, habit, family);
    }

    @Override
    public void respond() {
        System.out.println("Hi my ownwer");
    }
}
