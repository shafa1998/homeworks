package homework9.model;

public class DomesticCat extends Pet {
    homework9.model.Species species;

    public DomesticCat(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        this.setSpecies(Species.DOMESTICCAT);
    }

    @Override
    public void respond(String nickname) {
        System.out.printf("Meow");
    }

    @Override
    public void foul(){
        System.out.println("I fouled");
    }
}