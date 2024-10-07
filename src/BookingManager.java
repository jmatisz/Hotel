import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> listOfBookings = new ArrayList<>();

    public void addBooking(Booking oneBooking) {
        listOfBookings.add(oneBooking);
    }

    public void printBooking() {
        for (Booking item : listOfBookings) {
            System.out.println(item.getRoom().getRoomNumber());
        }
    }
}
