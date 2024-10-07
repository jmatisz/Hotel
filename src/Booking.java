import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isWorking;
    private List otherGuests;

    public Booking(Room room, Guest guest, LocalDate startDate, LocalDate endDate, boolean isWorking) {
        this.room = room;
        this.guest = guest;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isWorking = isWorking;
    }

    public Booking(Room room, LocalDate startDate, LocalDate endDate, boolean isWorking, List otherGuests) {
        this.room = room;
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
}
