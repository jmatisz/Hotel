import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        System.out.println(adela.getFirstName() + " " + adela.getLastName() +
                " (" + adela.getBirthdate() + ")");
        System.out.println(jan.getFirstName() + " " + jan.getLastName() +
                " (" + adela.getBirthdate() + ")");

        Room roomNum1 = new Room(1, 1, true, true,
                BigDecimal.valueOf(1000));
        Room roomNum2 = new Room(2, 1, true, true,
                BigDecimal.valueOf(1000));
        Room roomNum3 = new Room(3, 3, false, true,
                BigDecimal.valueOf(2400));

        System.out.println("pokoj číslo " + roomNum1.getRoomNumber() + " a pokoj číslo " +
                roomNum2.getRoomNumber() + " jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a " +
                "výhledem na moře.");
        System.out.println("pokoj číslo " + roomNum3.getRoomNumber() + " je trojlůžkový za cenu 2400 Kč/noc," +
                " bez balkónu, s výhledem na moře.");

        Booking booking1 = new Booking(roomNum1, adela, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), true);
        Booking booking2 = new Booking(roomNum3, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), true, guests);

        BookingManager manager = new BookingManager();
        manager.addBooking(booking1);
        manager.addBooking(booking2);
        manager.printBooking();
    }
}