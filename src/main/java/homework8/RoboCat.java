package homework8;

import java.util.Set;

public class RoboCat extends Pet implements Foul {
    public RoboCat() {
    }

    public RoboCat(String nickName, int age, int trickLevel, Set<String> habit, Family family) {
        super(nickName, age, trickLevel, habit, family);
        this.species= Species.ROBOCAT;
    }

    public void foul(){
        System.out.println("I am a robot");
    }
    @Override
    public void respond() {
        System.out.println("Hi my ownwer");
    }
}
