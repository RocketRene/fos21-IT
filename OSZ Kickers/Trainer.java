public class Trainer extends Mitglied {
    private char lizenzklasse;
    private int aufwandsentschaedigung;

    public Trainer(String name, int telefonnummer, boolean beitragGezahlt, char lizenzklasse, int aufwandsentschaedigung) {
        super(name, telefonnummer, beitragGezahlt);
        this.lizenzklasse = lizenzklasse;
        this.aufwandsentschaedigung = aufwandsentschaedigung;
    }

    public char getLizenzklasse() {
        return lizenzklasse;
    }

    public void setLizenzklasse(char lizenzklasse) {
        this.lizenzklasse = lizenzklasse;
    }

    public int getAufwandsentschaedigung() {
        return aufwandsentschaedigung;
    }

    public void setAufwandsentschaedigung(int aufwandsentschaedigung) {
        this.aufwandsentschaedigung = aufwandsentschaedigung;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "lizenzklasse=" + lizenzklasse +
                ", aufwandsentschaedigung=" + aufwandsentschaedigung +
                "} " + super.toString();
    }

}
