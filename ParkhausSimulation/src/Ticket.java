import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime parkStart;
    private int kosten ;

    public Ticket() {
        this.parkStart = LocalDateTime.now();
        this.kosten = 0;
    }

    public LocalDateTime getParkStart() {
        return parkStart;
    }

    public void setParkStart(LocalDateTime parkStart) {
        this.parkStart = parkStart;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "parkStart=" + parkStart +
                ", kosten=" + kosten +
                '}';
    }
}
