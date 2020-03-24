package homework7;

public class Man extends Human implements Greeting {
    public Man() {
    }
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
        this.setFamily(super.getFamily());
    }

    public void repaircar(){
        System.out.println("REPAIR Car");
    }

    @Override
    public void greet() {
        System.out.println(" Give me five!");
    }
}
