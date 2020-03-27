package homework9.model;

public class Human {
    private String name;
    private String surname;
    private int year;//bu taskin esas olayi budu
    private int iq;

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIq() {
        return iq;
    }

    public int getAge() {
        return year;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing is in Human class");
    }
}