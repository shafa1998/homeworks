package homework5;

import java.util.Arrays;

public class Pet {
    private String species;
    private String name;
    private int age;
    private int trickLevel;
    private String[] habit;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String[] getHabit() {
        return habit;
    }

    public void setHabit(String[] habit) {
        this.habit = habit;
    }

    @Override
    public String toString() {
        return species + "{" +
                "nickname =" + this.name + "," +
                "age =" + this.age + "," +
                "trickLevel =" + this.trickLevel + "," +
                "habits =" + Arrays.toString(habit) + "}";
    }
}
