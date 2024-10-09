package work;

import java.util.Scanner;

public class MainModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPet Adoption Platform Menu:");
            System.out.println("1. Display Available Pets");
            System.out.println("2. Record a Donation");
            System.out.println("3. Manage Adoption Events");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PetListing.displayAvailablePets();
                    break;
                case 2:
                    DonationRecording.recordDonation();
                    break;
                case 3:
                    AdoptionEventManagement.retrieveEvents();
                    System.out.print("Enter Event ID to register for an event: ");
                    int eventID = scanner.nextInt();
                    AdoptionEventManagement.registerParticipant(eventID);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

