package homework7;

import homework7.Species;

public class Fish extends Pet implements Foul {
    public Fish() {
    }

    public Fish( String nickName, int age, int trickLevel, String[] habit, Family family) {
        super( nickName, age, trickLevel, habit, family);
        this.species=Species.fish;
    }

    public void foul(){
        System.out.println("I am swimming");
    }

    @Override
    public void respond() {
        System.out.println("...");
    }

}
