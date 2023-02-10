public class Schiedsrichter extends Mitglied {
    private int anzahlSpiele;


    public Schiedsrichter(String name, int telefonnummer, boolean beitragGezahlt, int anzahlSpiele) {
        super(name, telefonnummer, beitragGezahlt);
        this.anzahlSpiele = anzahlSpiele;
    }


    public int getAnzahlSpiele() {
        return anzahlSpiele;
    }

    public void setAnzahlSpiele(int anzahlSpiele) {
        this.anzahlSpiele = anzahlSpiele;
    }

    @Override
    public String toString() {
        return "Schiedsrichter{" +
                "anzahlSpiele=" + anzahlSpiele +
                "} " + super.toString();
    }


}
