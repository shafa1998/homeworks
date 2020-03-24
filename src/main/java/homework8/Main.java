package homework8;

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
    }
}
