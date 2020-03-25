package homework8;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List children=new ArrayList<>();
    private Set<Pet> pets;

    public Family() {
    }

    public Family(Human mother, Human father, List children, Set<Pet> pets) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pets = pets;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
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

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pets;
    }

    public void setPet(Set<Pet> pet) {
        this.pets = pets;
    }
    public int countFamily(){
        int count=2+children.size();
        return count;
    }

    public void deleteChildByName(Human name) {
        children.remove(name);
    }
    public void deleteChildByIndex(int index) {
        children.remove(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father) &&
                children.equals(family.children) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pets);
    }

    public void finalize(){
        System.out.println("Family deleted");
    }

    public boolean addChild(Human human){
        children.add(human);
        return true;
    }
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pets=" + pets +
                '}';
    }
}
