import java.math.BigDecimal;
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

    public Booking getBooking(int index) {
        for (int i = 0; i < listOfBookings.size(); i++) {
            if (index == i) {
                return listOfBookings.get(i);
            }
        }
        return null;
    }

    public List<Booking> getBookings() {
        return listOfBookings;
    }

    public void clearBookings() {
        listOfBookings.clear();
    }

    public int getNumberOfWorkingBookings() {
        int sum = 0;
        for (int i = 0; i < listOfBookings.size(); i++) {
            if (listOfBookings.get(i).isWorking()) {
                sum++;
            }
        }
        return sum;
    }

    public double getAverageGuests() {
        double countGuests = 0;
        for (Booking booking : listOfBookings) {
            countGuests += booking.getGuestsCount();
        }
        return countGuests / listOfBookings.size();
    }

    public List<Booking> getTopNHolidayBookings(int numberBooking) {
        List<Booking> topBooking = new ArrayList<>();
        int item = 0;
        for (Booking booking : listOfBookings) {
            if (!booking.isWorking() && item < numberBooking) {
                topBooking.add(booking);
                item++;
            }
        }
        return topBooking;
    }

    public void printGuestStatistics() {
        int oneGuest = 0, twoGuests = 0, moreThanTwoGuests = 0;
        for (Booking booking : listOfBookings) {
            if (booking.getGuestsCount() == 1) {
                oneGuest++;
            } else if (booking.getGuestsCount() == 2) {
                twoGuests++;
            } else if (booking.getGuestsCount() > 2) {
                moreThanTwoGuests++;
            }
        }
        System.out.println("Počet rezervací s jedním hostem: " + oneGuest);
        System.out.println("Počet rezervací se dvěma hosty: " + twoGuests);
        System.out.println("Počet rezervací s více než dvěma hosty: " + moreThanTwoGuests);
    }

}
