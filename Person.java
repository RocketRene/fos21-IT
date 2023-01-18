public class Person {
    private String name;
    private Datum geburtsdatum;

    public Person(String name, Datum geburtsdatum) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Datum getGeburtsdatum() {
        return geburtsdatum;
    }

    public static void main(String[] args) {
        Datum geburtsdatum = new Datum(12, 6, 1990);
        Person person = new Person("Max Mustermann", geburtsdatum);
        System.out.println("Name: " + person.getName());
        System.out.println("Geburtsdatum: " + person.getGeburtsdatum());
    }
}
