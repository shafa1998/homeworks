package homework7;

import homework7.Species;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat() {
    }

    public DomesticCat(String nickName, int age, int trickLevel, String[] habit, Family family) {
        super(nickName, age, trickLevel, habit, family);
        this.species=Species.domesticcat;
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
