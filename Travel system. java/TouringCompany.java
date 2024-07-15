import java.util.LinkedList;
import java.util.Queue;

/*class TouringCompany {
      Queue<Tourist> touristsQueue;
     LinkedList<Destination> destinations;

    public TouringCompany() {
        touristsQueue = new LinkedList<>();
        destinations = new LinkedList<>();
        destinations.add(new Destination("Berlin"));
        destinations.add(new Destination("Marseille"));
        destinations.add(new Destination("Nairobi"));
        destinations.add(new Destination("Tokyo"));
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
    }

    public void serveNextTourist() {
        Tourist nextTourist = touristsQueue.poll();
        if (nextTourist != null) {
            System.out.println("Serving " + nextTourist.getName());
        } else {
            System.out.println("No more tourists to serve.");
        }
    }

    
    }  */

class TouringCompany {
    private final Queue<Tourist> touristsQueue;
    private final LinkedList<Destination> destinations;

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

