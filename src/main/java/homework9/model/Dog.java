package homework9.model;

public class Dog extends Pet {
    Species species;

    public Dog(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        this.setSpecies(Species.DOG);
    }

    @Override
    public void respond(String nickname) {
        System.out.printf("havhav");
    }

    @Override
    public void foul(){
        System.out.println("I fould :(");
    }
}