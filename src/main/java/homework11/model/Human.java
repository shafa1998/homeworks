package homework11.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Human {
    private String name;
    private String surname;
    private long daateOfBirth;
    private int iq;

    public Human(String name, String surname, int daateOfBirth, int iq) {
        this.name = name;
        this.surname = surname;
        this.daateOfBirth = daateOfBirth;
        this.iq = iq;
    }
    public Human() {
    }
//constructor for adopted children
    public Human(String name, String surname, long tofiq, int iq) {
        this.name = name;
        this.surname = surname;
        this.daateOfBirth =tofiq ;
        this.iq = iq;
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

    public long getAge() {
        return daateOfBirth;
    }

    @Override
    public String toString() {
        String date = DateTimeFormatter
                .ofPattern("dd/MM/yyyy")
                .format(Instant.ofEpochMilli(daateOfBirth).atZone(ZoneId.systemDefault())
                        .toLocalDate());
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + date +
                ", iq=" + iq +
                '}';
    }//fso

    public String describeAge() {
        LocalDate localDate = Instant.ofEpochMilli(daateOfBirth)
                .atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(localDate, LocalDate.now());
        return String.format("year: %d, month: %d, day: %d",
                period.getYears(), period.getMonths(), period.getDays());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing is in Human class");
    }
}