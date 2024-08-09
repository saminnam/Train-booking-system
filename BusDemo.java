import java.util.*;

public class BusDemo {
    public static void main(String[] args) {

        ArrayList<BussInfo> buses = new ArrayList<BussInfo>(); 
        ArrayList<BookingsInfo> bookings = new ArrayList<BookingsInfo>();
        buses.add(new BussInfo(1, true, 10));
        buses.add(new BussInfo(2, false, 3));
        buses.add(new BussInfo(3, true, 5));
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        for (BussInfo b : buses) {
            b.displayBusInfo();
        }
        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to exit..");
            userOpt = scanner.nextInt();
            if (userOpt == 1) {
                BookingsInfo bookings1 = new BookingsInfo();
                if (bookings1.isAvailable(bookings, buses)) {
                    bookings.add(bookings1);
                    System.out.println("Your booking is confirmed");
                }
                else {
                	System.out.println("Sorry, bus is full. Try on another bus or date.");
                }
            }
        }
        scanner.close();
    }
}
