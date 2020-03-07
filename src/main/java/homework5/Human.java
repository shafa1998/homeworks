package homework5;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private  String[][] scedule;

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getScedule() {
        return scedule;
    }

    public void setScedule(String[][] scedule) {
        this.scedule = scedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name ="+this.name+","+
                "surname = "+this.surname+","+
                "year="+ this.year+","+
                "iq="+this.iq+","+
                "mother="+this.mother.surname + " " + this.mother.name + ","+
                "father="+this.father.surname + " " + this.father.name + ","+
                "pet="+pet.toString();
    }
}

