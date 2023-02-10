public class Mitglied {
    private String name;
    private int telefonnummer;
    private boolean beitragGezahlt;

    public Mitglied() {

    }

    public Mitglied(String name, int telefonnummer, boolean beitragGezahlt) {
        this.name = name;
        this.telefonnummer = telefonnummer;
        this.beitragGezahlt = beitragGezahlt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public boolean isBeitragGezahlt() {
        return beitragGezahlt;
    }

    public void setBeitragGezahlt(boolean beitragGezahlt) {
        this.beitragGezahlt = beitragGezahlt;
    }

    @Override
    public String toString() {
        return "Mitglied{" +
                "name='" + name + '\'' +
                ", telefonnummer=" + telefonnummer +
                ", beitragGezahlt=" + beitragGezahlt +
                '}';
    }
}
