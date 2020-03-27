package homework9.model;

public class RoboCat extends Pet {
    homework9.model.Species species;

    public RoboCat(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        this.setSpecies(Species.ROBOCAT);
    }

    @Override
    public void respond(String nickname) {
        System.out.printf("I am a robot");
    }

    @Override
    public void foul() {
    }
}