package work;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnectionUtil;

public class PetListing {
    public static void displayAvailablePets() {
        String query = "SELECT * FROM Pets WHERE AvailableForAdoption = 1";

        try (Connection connection = DBConnectionUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            System.out.println("Available Pets for Adoption:");
            while (resultSet.next()) {
                int petID = resultSet.getInt("PetID");
                String name = resultSet.getString("Name");
                int age = resultSet.getInt("Age");
                String breed = resultSet.getString("Breed");
                String type = resultSet.getString("Type");
                System.out.printf("PetID: %d, Name: %s, Age: %d, Breed: %s, Type: %s%n",
                        petID, name, age, breed, type);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving pet listings: " + e.getMessage());
        }
    }
}

