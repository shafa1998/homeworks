package homework9.model;

public abstract class Pet {
    private homework9.model.Species species;
    private String nickname;
    private int age;
    private int trickLevel;

    public Pet(String nickname, int age, int trickLevel) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public Pet() {
        this.species = homework9.model.Species.UNKNOWN;
    }


    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond(String nickname);

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                '}';
    }
}
