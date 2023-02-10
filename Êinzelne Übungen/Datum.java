public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public Datum() {
        this.tag = 1;
        this.monat = 1;
        this.jahr = 1970;
    }

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return tag + "." + monat + "." + jahr;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Datum)) {
            return false;
        }
        Datum d = (Datum) o;
        return d.tag == this.tag && d.monat == this.monat && d.jahr == this.jahr;
    }
    public static int quartal(Datum d) {
        int monat = d.getMonat();
        if (monat < 4) {
            return 1;
        } else if (monat < 7) {
            return 2;
        } else if (monat < 10) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Datum testDatum = new Datum(8, 5, 2006);
        int ergebnis = Datum.quartal(testDatum);
        System.out.println("Das Datum " + testDatum + " befindet sich im Quartal " + ergebnis);
    }
}
