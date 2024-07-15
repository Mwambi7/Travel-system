
import java.util.Stack;

class Tourist {
     String name;
    Stack<Destination> bookings;

    public Tourist(String name) {
        this.name = name;
        bookings = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void bookDestination(Destination destination) {
        if (destination != null) {
            bookings.push(destination);
            System.out.println(name + " booked " + destination.getName());
        } else {
            System.out.println("Destination not found.");
        }
    }

    public void cancelLastBooking() {
        if (!bookings.isEmpty()) {
            Destination cancelledDestination = bookings.pop();
            System.out.println(name + " canceled booking to " + cancelledDestination.getName());
        } else {
            System.out.println("No bookings to cancel.");
        }
    }
}

