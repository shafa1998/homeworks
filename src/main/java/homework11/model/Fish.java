package homework11.model;

public class Fish extends Pet {
    Species species;

    public Fish(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        this.setSpecies(Species.FISH);
    }

    @Override
    public void respond(String nickname) {
        System.out.printf("....");
    }

    @Override
    public void foul() {
    }
}