import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isWorking;
    private List otherGuests = new ArrayList<>();

    public Booking(Room room, Guest guest, LocalDate startDate, LocalDate endDate, boolean isWorking) {
        this.room = room;
        this.guest = guest;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isWorking = isWorking;
    }

    public Booking(Room room, Guest guest, LocalDate startDate, LocalDate endDate, boolean isWorking, List otherGuests) {
        this.room = room;
        this.guest = guest;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isWorking = isWorking;
        this.otherGuests = otherGuests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List otherGuests) {
        this.otherGuests = otherGuests;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getGuestsCount() {
        return otherGuests.size() + 1;
    }

    public int getBookingLength() {
        LocalDate start = startDate;
        LocalDate end = endDate;
        return start.until(end).getDays();
    }

    public BigDecimal getTotalPrice() {
        return BigDecimal.valueOf(getBookingLength()).multiply(room.getPrice());
    }

    public String getFormattedSummary() {
        return startDate.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")) + " až " +
                endDate.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")) + ": " +
                guest.getFirstName() + " " + guest.getLastName() + " (" +
                guest.getBirthdate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd")) + ")" +
                "[" + getGuestsCount() + ", " + (room.isViewOnSea() ? "ano" : "ne") + "] za " + getTotalPrice() + " Kč";
    }
}
