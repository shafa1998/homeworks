package homework5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human mother=new Human("Leyla","Memmedova",28);
        Human father= new Human("Akif","Memmedov",30);
        Family family= new Family(mother,father);
        Human child1= new Human("Kenan","Memmedov",5);
        Human child2=new Human("Gunel","Memmedova",3);
        System.out.println(mother);
        System.out.println(child1);

        family.addChild(child1);
        family.addChild(child2);
        System.out.println(Arrays.toString(family.getChildren()));
        System.out.println(child1.getFamily());
        System.out.println(family.countFamily());

        family.deleteChild(child1);
        System.out.println(family.countFamily());



        Pet pet= new Pet("cat","mestan",1, 50,new String[]{"sleeping","eating"});
        System.out.println(pet);
        family.setPet(pet);
        System.out.println(pet.getFamily());
        System.out.println(child2.getFamily().getPet());

        mother.feed(true);
//
//        child2.welcomePet();
//        child2.describeFavoritePet();
//        System.out.println(family.countFamily());
    }

}