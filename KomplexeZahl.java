public class KomplexeZahl {
    private double realteil;
    private double imaginaerteil;

    public KomplexeZahl() {
        // Standardkonstruktor: Initialisierung mit Real- und Imaginaerteil 0.0
        this.realteil = 0.0;
        this.imaginaerteil = 0.0;
    }

    public KomplexeZahl(double realteil, double imaginaerteil) {
        this.realteil = realteil;
        this.imaginaerteil = imaginaerteil;
    }

    public double getRealteil() {
        return realteil;
    }

    public void setRealteil(double realteil) {
        this.realteil = realteil;
    }

    public double getImaginaerteil() {
        return imaginaerteil;
    }

    public void setImaginaerteil(double imaginaerteil) {
        this.imaginaerteil = imaginaerteil;
    }

    @Override
    public String toString() {
        return realteil + " + " + imaginaerteil + "i";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof KomplexeZahl)) {
            return false;
        }
        KomplexeZahl kz = (KomplexeZahl) o;
        return kz.realteil == this.realteil && kz.imaginaerteil == this.imaginaerteil;
    }

    public static KomplexeZahl multiplizieren(KomplexeZahl a, KomplexeZahl b) {
        double realteil = a.realteil * b.realteil - a.imaginaerteil * b.imaginaerteil;
        double imaginaerteil = a.realteil * b.imaginaerteil + a.imaginaerteil * b.realteil;
        return new KomplexeZahl(realteil, imaginaerteil);
    }

    public KomplexeZahl multiplizieren(KomplexeZahl zahl) {
        return multiplizieren(this, zahl);
    }

    public static void main(String[] args) {
        KomplexeZahl a = new KomplexeZahl(3.0, 2.0);
        KomplexeZahl b = new KomplexeZahl(1.0, -4.0);

        // Testen der Klassenmethode zur Multiplikation
        KomplexeZahl ergebnis1 = KomplexeZahl.multiplizieren(a, b);
        System.out.println("Ergebnis der Klassenmethode: " + ergebnis1);

        // Testen der Objektmethode zur Multiplikation
        KomplexeZahl ergebnis2 = a.multiplizieren(b);
        System.out.println("Ergebnis der Klassenmethode: " + ergebnis2);
    }
}
