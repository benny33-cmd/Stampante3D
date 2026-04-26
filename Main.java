import java.util.*;

public class Main {

    public static void main(String[] args) {
        Database.init();
        
        port(8080);
        BookingService service = new BookingService();

        Booking b1 = new Booking("Terra", "7:55-8:50", "Mario");
        boolean ok = service.prenota(b1);

        if (ok) {
            System.out.println("Prenotazione effettuata!");
        } else {
            System.out.println("Orario già occupato!");
        }
    }
}
