package homework10.model;

public final class Man extends Human {
    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Man(){
    }

    public void repairCar() {
        System.out.println("Repair something ");
    }

    public void greetPet(){
        System.out.println("Just Greeting");
    }
}
