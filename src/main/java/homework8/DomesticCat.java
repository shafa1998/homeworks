package homework8;

import homework6.Species;

import java.util.Set;

public class DomesticCat extends Pet {
    public DomesticCat() {
    }

    public DomesticCat(Species species, String nickName, int age, int trickLevel, Set<String> habit, Family family) {
        super(species, nickName, age, trickLevel, habit, family);
    }

    @Override
    public void respond() {
        System.out.println("Meow");
    }

    @Override
    public void foul() {
        super.foul();
    }
}
