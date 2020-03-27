package homework10.model;

import java.util.ArrayList;
import java.util.List;

public class Family{
    private Woman mother;
    private Man father;
    private List<Human> children;
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    public static int countOfFamily = 0;

    public Family(Woman mother, Man father) {
        this.mother = mother;
        this.father = father;
        this.countOfFamily += 2;
        this.children = new ArrayList<>();
    }


    public Woman getMother() {
        return mother;
    }

    public boolean addChild(Human child) {
        children.add(child);
        countOfFamily++;
        return true;
    }

    public Man getFather() {
        return father;
    }

    public int countFamily() {
        return 2 + this.children.size();
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "\nmother=" + mother +
                ", \nfather=" + father +
                ", \nchildren=" + children +
                ", \npets=" + pets +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing is in Family class");
    }
}