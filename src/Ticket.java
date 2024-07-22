import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String ID;
    private String concertHall;
    private int eventCode;
    private Timestamp time;
    private boolean isPromo;
    private char stadiumSector;
    private float backpackWeight;
    private double tikcetPrice;
    private final Timestamp creationTime = new Timestamp(System.currentTimeMillis());

    // Method to parse the string and convert it to Timestamp
    private Timestamp parseTimestamp(String dateTimeString) {
        // Define the formatter with the pattern of the input string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // Parse the string to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

        // Convert LocalDateTime to Timestamp
        return Timestamp.valueOf(localDateTime);
    }

    //ADDING GETTER AND SETTER FOR PRIVATE VARIABLES
    // ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if (ID.length() <= 4) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Cannot be more than 4 characters.");
        }
    }
    // ConcertHall
    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        if (concertHall.length() <= 10) {
            this.concertHall = concertHall;
        } else {
            throw new IllegalArgumentException("Cannot be more than 10 characters.");
        }
    }
    // EventCode
    public int getEventCode() {
        return this.eventCode;
    }

    public void setEventCode(int eventCode) {
        if (eventCode >= 100 && eventCode <= 999) {
            this.eventCode = eventCode;
        } else {
            throw new IllegalArgumentException("Must be a 3 digit number.");
        }
    }
    // Time
    public Timestamp getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = parseTimestamp(time);
    }
    // isPromo
    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }
    // StadiumSector
    public char getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(char stadiumSector) {
        if (stadiumSector >= 'A' && stadiumSector <= 'C') {
            this.stadiumSector = stadiumSector;
        } else {
            throw new IllegalArgumentException("Allowed characters: 'A', 'B', 'C'.");
        }
    }
    // BackpackWeight
    public float getBackpackWeight() {
        return backpackWeight;
    }

    public void setBackpackWeight(float backpackWeight) {
        this.backpackWeight = backpackWeight;
    }
    // TicketPrice
    public double getTikcetPrice() {
        return tikcetPrice;
    }

    public void setTikcetPrice(double tikcetPrice) {
        this.tikcetPrice = tikcetPrice;
    }
    // creationTime
    public Timestamp getCreationTime() {
        return creationTime;
    }

    // INITIALIZING CONSTRUCTORS

    // empty
    public Ticket() {
    }

    // limited
    public Ticket(String concertHall, int eventCode, String time) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = parseTimestamp(time);
    }
    // full
    public Ticket(String ID, String concertHall, int eventCode, String time, boolean isPromo, char stadiumSector, float backpackWeight) {
        this.ID = ID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = parseTimestamp(time);
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.backpackWeight = backpackWeight;
    }
}