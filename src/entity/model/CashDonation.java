package entity.model;

import java.util.Date;

public class CashDonation extends Donation {
    // Additional attribute
    private Date donationDate;

    // Constructor
    public CashDonation(String donorName, double amount, Date donationDate) throws Exception {
        super(donorName, amount); // Call the Donation constructor
        this.donationDate = donationDate;
    }

    // Getter and Setter for donationDate
    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    // Implementation of the recordDonation method
    @Override
    public void recordDonation() {
        System.out.println("Recording cash donation of $" + getAmount() + " from " + getDonorName() + " on " + donationDate);
    }
}
