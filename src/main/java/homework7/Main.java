package homework7;

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
        System.out.println(family);
        Pet dog2=new Dog("bethoven",5,20,new String[]{"barking"},family);
        Pet pet= new Pet("aaaa", 2, 30, new String[]{"sleeping"}, family) {
            @Override
            public void respond() {
                System.out.println("hello");
            }
        };

        family.setPet(dog2);

        System.out.println(dog2);
        System.out.println(pet);
        pet.foul();
        dog2.foul();
        pet.respond();
        dog2.respond();
        man.greet();
        woman.greet();
    }
}
