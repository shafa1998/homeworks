package homework8;

import java.util.Set;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat() {
    }

    public DomesticCat(String nickName, int age, int trickLevel, Set<String> habit, Family family) {
        super(nickName, age, trickLevel, habit, family);
        this.species= Species.DOMESTICCAT;
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
