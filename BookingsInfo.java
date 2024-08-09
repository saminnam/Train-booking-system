import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookingsInfo {
    String passengerName;
    int busNo;
    Date date;

    BookingsInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the passenger: ");
        passengerName = scanner.next();
        System.out.println("Enter the bus no: ");
        busNo = scanner.nextInt();
        System.out.println("Enter the date (dd-MM-yyyy): ");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // scanner.close(); // Do not close scanner here to avoid closing System.in
    }

    public boolean isAvailable(ArrayList<BookingsInfo> bookings, ArrayList<BussInfo> buses) {
        int capacity = 0;
        for (BussInfo bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int bookedSeats = 0;
        for (BookingsInfo b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                bookedSeats++;
            }
        }

        return bookedSeats < capacity;
    }
}
