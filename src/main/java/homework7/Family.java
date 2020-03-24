package homework7;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human [] children=new Human[0];
    private Pet pet;

    public Family() {
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        pet.setFamily(this);
    }
    public int countFamily(){
        int count=2+children.length;
        if (getPet()!=null)
            count++;
        return  count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father) &&
                Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
    public void finalize(){
        System.out.println("Family deleted");
    }

    public void addChild(Human human){
        children=Arrays.copyOf(children,children.length+1);
        children[children.length-1]=human;
        human.setFamily(this);
    }
    public void deleteChild(Human human){
        Human[] result= new Human[children.length-1];
        int a=0;
        for (Human child : children) {
            if (child.equals(human)){
                continue;
            } result[a++]=child;
        }
        children=result;
    }

    public boolean deleteChild(int index){
        if (index<0|| index>=children.length){
            return false;
        }else{
            Human [] result=new Human[children.length-1];
            int a=0;
            for (int i = 0; i < result.length; i++) {
                if (i!=index){
                    result [a]=children[i];
                    a++;
                }
            }
            children=result;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.toString()+
                ", father=" + father.toString() +
                ", children=" + Arrays.toString(children) +
                ", pet=" + String.valueOf(pet) +
                '}';
    }


}
