package homework8;

import java.util.Map;

public class Woman extends Human  {
    public Woman() {
    }

    public Woman(String name, String surname, int year, int iq, Map<Integer, String> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

}
