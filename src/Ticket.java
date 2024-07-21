import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    int ticketID;
    String concertHall;
    int eventCode;
    Timestamp time;
    boolean isPromo;
    char stadiumSector;
    float backpackWeight;
    Timestamp creationTime = new Timestamp(System.currentTimeMillis());
    private float tikcetPrice;

    // Adding ability to get and set price for ticket
    public float getTikcetPrice() {
        return tikcetPrice;
    }

    public void setTikcetPrice(float tikcetPrice) {
        this.tikcetPrice = tikcetPrice;
    }

    // Method to parse the string and convert it to Timestamp
    private Timestamp parseTimestamp(String dateTimeString) {
        // Define the formatter with the pattern of the input string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // Parse the string to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

        // Convert LocalDateTime to Timestamp
        return Timestamp.valueOf(localDateTime);
    }

    // Initializing constructors
    // empty
    public Ticket() {
    }
    // limited
    public Ticket(String concertHall, int eventCode) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
    }
    // full
    public Ticket(int ticketID, String concertHall, int eventCode, String time, boolean isPromo, char stadiumSector, float backpackWeight) {
        this.ticketID = ticketID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = parseTimestamp(time);
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.backpackWeight = backpackWeight;
    }
}
