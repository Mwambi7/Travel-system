import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TouringCompany company = new TouringCompany();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Touring company!");
        company.printAvailableDestinations();

        Tourist tourist1 = new Tourist("Terry");
        Tourist tourist2 = new Tourist("Amon");

        company.addTourist(tourist1);
        company.addTourist(tourist2);

        tourist1.bookDestination((Destination) company.getDestinationByName("Marseille"));
        tourist1.bookDestination((Destination) company.getDestinationByName("Nairobi"));
        tourist1.cancelLastBooking();

        tourist2.bookDestination((Destination) company.getDestinationByName("Tokyo"));
        tourist2.bookDestination((Destination) company.getDestinationByName("Berlin"));

        company.serveNextTourist();
        company.serveNextTourist();

        scanner.close();
    }
    }
    