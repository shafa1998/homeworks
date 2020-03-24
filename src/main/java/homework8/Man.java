package homework8;

import java.util.Map;

public class Man extends Human {
    public Man() {
    }
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, Map<Integer, String> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }
}
