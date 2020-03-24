package homework7;

import homework7.Species;

public class RoboCat extends Pet implements Foul {
    public RoboCat() {
    }

    public RoboCat(String nickName, int age, int trickLevel, String[] habit, Family family) {
        super(nickName, age, trickLevel, habit, family);
        this.species=Species.robocat;
    }

    public void foul(){
        System.out.println("I am a robot");
    }
    @Override
    public void respond() {
        System.out.println("Hi my ownwer");
    }
}
