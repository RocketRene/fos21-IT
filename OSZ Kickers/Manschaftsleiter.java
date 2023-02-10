public class Manschaftsleiter extends Spieler {
    private String mannschaftsName;
    private int rabbatHoehe;

    public Manschaftsleiter(String name, int telefonnummer, boolean beitragGezahlt, int trikotnummer, String position, String mannschaftsName, int rabbatHoehe) {
        super(name, telefonnummer, beitragGezahlt, trikotnummer, position);
        this.mannschaftsName = mannschaftsName;
        this.rabbatHoehe = rabbatHoehe;
    }

    public String getMannschaftsName() {
        return mannschaftsName;
    }

    public void setMannschaftsName(String mannschaftsName) {
        this.mannschaftsName = mannschaftsName;
    }

    public int getRabbatHoehe() {
        return rabbatHoehe;
    }

    public void setRabbatHoehe(int rabbatHoehe) {
        this.rabbatHoehe = rabbatHoehe;
    }

    @Override
    public String toString() {
        return "Manschaftsleiter{" +
                "mannschaftsName='" + mannschaftsName + '\'' +
                ", rabbatHoehe=" + rabbatHoehe +
                "} " + super.toString();
    }
}
