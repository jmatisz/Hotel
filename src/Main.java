import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Guest adela = new Guest("Adéla", "Malíková",
                LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček",
                LocalDate.of(1995, 5, 5));

        List<Guest> guests = new ArrayList<>();
        guests.add(adela);
        guests.add(jan);

        jan.setBirthdate(LocalDate.of(1995, 4, 5));

//        System.out.println(adela.getFirstName() + " " + adela.getLastName() +
//                " (" + adela.getBirthdate() + ")");
//        System.out.println(jan.getFirstName() + " " + jan.getLastName() +
//                " (" + adela.getBirthdate() + ")");

        Room roomNum1 = new Room(1, 1, true, true,
                BigDecimal.valueOf(1000));
        Room roomNum2 = new Room(2, 1, true, true,
                BigDecimal.valueOf(1000));
        Room roomNum3 = new Room(3, 3, false, true,
                BigDecimal.valueOf(2400));

//        System.out.println("pokoj číslo " + roomNum1.getRoomNumber() + " a pokoj číslo " +
//                roomNum2.getRoomNumber() + " jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a " +
//                "výhledem na moře.");
//        System.out.println("pokoj číslo " + roomNum3.getRoomNumber() + " je trojlůžkový za cenu 2400 Kč/noc," +
//                " bez balkónu, s výhledem na moře.");

        Booking booking1 = new Booking(roomNum1, adela, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), false);
        Booking booking2 = new Booking(roomNum3, jan, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), false, guests);

        BookingManager manager = new BookingManager();
        manager.addBooking(booking1);
        manager.addBooking(booking2);
//        manager.printBooking();

//        System.out.println(manager.getBooking(1).getRoom().getRoomNumber());
//        System.out.println(manager.getBookings());
        System.out.println("Počet pracovních pobytů: " + manager.getNumberOfWorkingBookings());
        //manager.clearBookings();
//        System.out.println(manager.getBookings());

        System.out.println("\nPrůměrný počet hostů na rezervaci: " + manager.getAverageGuests());
        System.out.println("\nPrvních osm rekreačních rezervací:");
        for (Booking booking : manager.getTopNHolidayBookings(8)) {
            System.out.println(booking.getFormattedSummary());
        }

        System.out.println("\nStatistiky hostů:");
        manager.printGuestStatistics();
//        System.out.println(booking1.getBookingLength());
//        System.out.println(booking1.getTotalPrice());

        System.out.println("\nPočet pracovních pobytů: " + manager.getNumberOfWorkingBookings() + "\n");

        for (Booking booking : manager.getBookings()) {
            System.out.println(booking.getFormattedSummary());
        }

        fillBookings(roomNum3, roomNum2);

    }

    private static void fillBookings(Room roomNum3, Room roomNum2) {
        List<Booking> recordsBookings = new ArrayList<>();
        List<Guest> guests = new ArrayList<>();
        Guest karel1 = new Guest("Karel", "Dvořák", LocalDate.of(
                1990, 5, 15));
        Guest karel2 = new Guest("Karel", "Dvořák", LocalDate.of(
                1979, 1, 3));
        Guest karolina = new Guest("Karolína", "Tmavá", LocalDate.of(
                1990, 5, 15));
        guests.add(karel1);
        recordsBookings.add(new Booking(roomNum3, karel1, LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 6, 7), true));
        recordsBookings.add(new Booking(roomNum2, karel2, LocalDate.of(2023, 7, 18),
                LocalDate.of(2023, 7, 21), false));
        recordsBookings.add(new Booking(roomNum3, karolina, LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 8, 31), true,
                guests));

        for (int i = 1; i < 20; i++) {
            recordsBookings.add(new Booking(roomNum2, karolina, LocalDate.of(2023, 8, i),
                    LocalDate.of(2023, 8, i+1), false));
        }
        for (Booking booking : recordsBookings) {
            System.out.println(booking.getFormattedSummary());
        }
    }
}