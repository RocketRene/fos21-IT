public class Spieler extends Mitglied {
    private int trikotnummer;
    private String position;


    public Spieler(String name, int telefonnummer, boolean beitragGezahlt, int trikotnummer, String position) {
        super(name, telefonnummer, beitragGezahlt);
        this.trikotnummer = trikotnummer;
        this.position = position;
    }

    public int getTrikotnummer() {
        return trikotnummer;
    }

    public void setTrikotnummer(int trikotnummer) {
        this.trikotnummer = trikotnummer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + "Trikotnummer" + this.trikotnummer + "  Position: " + this.position;
    }
}
