package homework7;

public class Dog extends Pet implements Foul {
    public Dog() {
    }

    public Dog( String nickName, int age, int trickLevel, String[] habit, Family family) {
        super( nickName, age, trickLevel, habit, family);
        this.species= Species.dog;

    }

    public void foul(){
        System.out.println("I need to go for a walk");
    }

    @Override
    public void respond() {
        System.out.println("havhav");
    }
}
