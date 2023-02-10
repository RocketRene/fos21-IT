public class Parkhaus {
    private int stellplaetze;
    private int stellplaetze_max;

    public Parkhaus(int stellplaetze_max) {
        this.stellplaetze_max = stellplaetze_max;
        this.stellplaetze = 0;
    }

    public int getStellplaetze() {
        return stellplaetze;
    }

    public void setStellplaetze(int stellplaetze) {
        this.stellplaetze = stellplaetze;
    }

    public Ticket Einfahrt() {
        boolean frei = this.stellplaetze_max - this.stellplaetze > 0;
        if (frei) {
            Ticket t = new Ticket();
            this.stellplaetze++;
            return t;
        }else {
            System.out.println("Parkaus ist voll");

        }
        return new Ticket();
    }
}
