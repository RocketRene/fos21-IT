import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    private String name;
    private Datum geburtsdatum;
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int ID;



    public Person(String name, Datum geburtsdatum) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        ID = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                ", ID=" + ID +
                '}';
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
        System.out.println(person.toString());
        Person person2 = new Person("Tester",geburtsdatum);
        System.out.println(person2);
}}