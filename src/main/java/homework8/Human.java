package homework8;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Map<Integer,String> schedule;
    private Family family;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Map<Integer, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public void finalize(){
        System.out.println(getName()+" "+getSurname()+" deleted");
    }

    public void welcomePet(String nickname) {
        System.out.println("Welcome," + nickname);
    }

    public boolean feed(boolean feedingTime) {
        if (feedingTime) {
            System.out.println("I will feed my pet");
            return true;
        } else {
            System.out.println("My pet is not hungry");
            return false;
        }
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<Integer, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<Integer, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }
}