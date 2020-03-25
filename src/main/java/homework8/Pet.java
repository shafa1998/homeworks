package homework8;

import homework8.Species;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    public Species species=Species.UNKNOWN;
    private String nickName;
    private int age;
    private int trickLevel;
    private Set<String> habit;
    private Family family;

    public Pet() {
    }

    public Pet( String nickName, int age, int trickLevel, Set<String> habit, Family family) {
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habit = habit;
        this.family = family;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabit() {
        return habit;
    }

    public void setHabit(Set<String> habit) {
        this.habit = habit;
    }

    public void eat(){
        System.out.println("Im eating");
    }
    public abstract void respond();

    public void  foul(){
        System.out.println("I need to cover it up!");
    }

    public void finalize(){
        System.out.println(getNickName()+" deleted");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                species.equals(pet.species) &&
                nickName.equals(pet.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickName, age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habit=" + habit +
                ", family=" + family +
                '}';
    }
}