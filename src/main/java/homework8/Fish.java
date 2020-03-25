package homework8;

import java.util.Set;

public class Fish extends Pet implements Foul {
    public Fish() {
    }

    public Fish(String nickName, int age, int trickLevel, Set<String> habit, Family family) {
        super(nickName, age, trickLevel, habit, family);
        this.species= Species.FISH;
    }

    public void foul(){
        System.out.println("I am swimming");
    }

    @Override
    public void respond() {
        System.out.println("...");
    }

}
