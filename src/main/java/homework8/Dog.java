package homework8;

import java.util.Set;

public class Dog extends Pet implements Foul {
    public Dog() {
    }
    public Dog(String nickName, int age, int trickLevel, Set<String> habit, Family family) {
        super( nickName, age, trickLevel, habit, family);
        this.species= Species.DOG;
    }

    public Dog(String bethoven, int i, int i1) {
    }

    public void foul(){
        System.out.println("I need to go for a walk");
    }

    @Override
    public void respond() {
        System.out.println("havhav");
    }
}
