package homework8;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.respond();
        System.out.println();
        dog.eat();
        System.out.println();
        Fish fish = new Fish();
        fish.respond();

        Man man= new Man("Nurlan","Babayev",1980);
        Woman woman = new Woman("Sevinc", "Babayeva",1985);
        Family family = new Family(man,woman);
        Pet dog2=new Dog("bethoven",5,20);
        Pet pet = new Pet() {
            @Override
            public void respond() {
                System.out.println("Hello");
            }
        };
        Set<Pet> pets = new HashSet<>();
        pets.add(dog2);
        System.out.println(family);
        System.out.println(dog2);
        System.out.println(pet);
        pet.foul();
        dog2.foul();
        pet.respond();
        dog2.respond();
        man.greet();
        woman.greet();
        System.out.println(woman);
        }
    }
