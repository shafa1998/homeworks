package homework8;

import java.util.Map;

public class Woman extends Human implements Greeting  {
    public Woman() {
    }

    public Woman(String name, String surname, int year, int iq, Map<Integer,String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
        this.setFamily(super.getFamily());
    }

    public void makeup(){
        System.out.println("make up");
    }

    @Override
    public void greet() {
        System.out.println(" nice to meet you!");
    }
}
