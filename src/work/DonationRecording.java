package work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import util.DBConnectionUtil;

public class DonationRecording {
    public static void recordDonation() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Donor Name: ");
			String donorName = scanner.nextLine();

			System.out.print("Enter Donation Amount: ");
			double donationAmount = scanner.nextDouble();

			// Basic validation for donation amount
			if (donationAmount < 10) {
			    System.out.println("Donation amount must be at least $10.");
			    return;
			}

			String query = "INSERT INTO Donations (DonorName, DonationType, DonationAmount, DonationDate) VALUES (?, 'Cash', ?, NOW())";

			try (Connection connection = DBConnectionUtil.getConnection();
			     PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			    preparedStatement.setString(1, donorName);
			    preparedStatement.setDouble(2, donationAmount);
			    preparedStatement.executeUpdate();
			    System.out.println("Donation recorded successfully!");
			} catch (SQLException e) {
			    System.out.println("Error recording donation: " + e.getMessage());
			}
		}
        
    }
}

