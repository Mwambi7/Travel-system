import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Destination {
     String name;

    public Destination(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class TouringCompany {
    Queue<Tourist> touristsQueue;
     LinkedList<Destination> destinations;

    public TouringCompany() {
        touristsQueue = new LinkedList<>();
        destinations = new LinkedList<>();
        destinations.add(new Destination("Paris"));
        destinations.add(new Destination("New York"));
        destinations.add(new Destination("Tokyo"));
        destinations.add(new Destination("Sydney"));
        destinations.add(new Destination("Marseille"));
        destinations.add(new Destination("Nairobi"));
    }

    public void printAvailableDestinations() {
        System.out.println("Available destinations:");
        for (Destination destination : destinations) {
            System.out.println(destination.getName());
        }
    }

    public Destination getDestinationByName(String name) {
        for (Destination destination : destinations) {
            if (destination.getName().equalsIgnoreCase(name)) {
                return destination;
            }
        }
        return null;
    }

    public void addTourist(Tourist tourist) {
        touristsQueue.add(tourist);
        System.out.println("Added tourist: " + tourist.getName());
    }

    public void serveNextTourist() {
        Tourist nextTourist = touristsQueue.poll();
        if (nextTourist != null) {
            System.out.println("Serving " + nextTourist.getName());
        } else {
            System.out.println("No more tourists to serve.");
        }
    }
}

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

class Main {
    public static void main(String[] args) {
        TouringCompany company = new TouringCompany();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Touring company!");
        company.printAvailableDestinations();

        Tourist tourist1 = new Tourist("linet");
        Tourist tourist2 = new Tourist("Mwambi");

        company.addTourist(tourist1);
        company.addTourist(tourist2);

        tourist1.bookDestination(company.getDestinationByName("Paris"));
        tourist1.bookDestination(company.getDestinationByName("New York"));
        tourist1.bookDestination(company.getDestinationByName("Marseille"));
        tourist1.bookDestination(company.getDestinationByName("Nairobi"));
        tourist1.cancelLastBooking();

        tourist2.bookDestination(company.getDestinationByName("Tokyo"));
        tourist2.bookDestination(company.getDestinationByName("Sydney"));

        company.serveNextTourist();
        company.serveNextTourist();

        scanner.close();
    }
}
