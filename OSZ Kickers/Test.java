public class Test {
    public static void main(String[] args) {
        Mitglied m1 = new Mitglied("Rene", 1223, true);
        System.out.println(m1 + "\n----------------------------");

        Trainer t1 = new Trainer("Alrik", 1212, false, 'a', 200);
        System.out.println(t1 + "\n-------------------------------");

        Schiedsrichter sr1 = new Schiedsrichter("Jan", 2323, true, 22);
        System.out.println(sr1 + "\n--------------------------------");

        Spieler s1 = new Spieler("Deniz", 23323, false, 3434, "Sturm");
        System.out.println(s1 + "\n-------------------------------------");

        Manschaftsleiter ml1 = new Manschaftsleiter("Jana", 34343, false, 8947, "tor", "Berlin", 34);
        System.out.println(ml1);


    }
}
