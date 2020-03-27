package homework10.model;

public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(){
    }

    public void makeUp() {
        System.out.println("make-up");
    }

    public void greetPet() {
        System.out.println("nice to meet you");
    }
}
