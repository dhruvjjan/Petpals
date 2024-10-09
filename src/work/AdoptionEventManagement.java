package work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import util.DBConnectionUtil;

public class AdoptionEventManagement {
    public static void retrieveEvents() {
        String query = "SELECT * FROM AdoptionEvents";

        try (Connection connection = DBConnectionUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            System.out.println("Upcoming Adoption Events:");
            while (resultSet.next()) {
                int eventID = resultSet.getInt("EventID");
                String eventName = resultSet.getString("EventName");
                String eventDate = resultSet.getString("EventDate");
                String location = resultSet.getString("Location");
                System.out.printf("EventID: %d, Name: %s, Date: %s, Location: %s%n",
                        eventID, eventName, eventDate, location);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving adoption events: " + e.getMessage());
        }
    }

    public static void registerParticipant(int eventID) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Participant Name: ");
			String participantName = scanner.nextLine();

			System.out.print("Enter Participant Type (Shelter/Adopter): ");
			String participantType = scanner.nextLine();

			String query = "INSERT INTO Participants (ParticipantName, ParticipantType, EventID) VALUES (?, ?, ?)";

			try (Connection connection = DBConnectionUtil.getConnection();
			     PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			    preparedStatement.setString(1, participantName);
			    preparedStatement.setString(2, participantType);
			    preparedStatement.setInt(3, eventID);
			    preparedStatement.executeUpdate();
			    System.out.println("Participant registered successfully!");
			} catch (SQLException e) {
			    System.out.println("Error registering participant: " + e.getMessage());
			}
		}
    }
}
