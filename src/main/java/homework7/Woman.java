package homework7;

public class Woman extends Human implements Greeting  {
    public Woman() {
    }

    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public void greet() {
        System.out.println(this.getFamily().getPet().getNickName() +", ");
    }
}
