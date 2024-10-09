package entity.model;

public abstract class Donation {
    // Attributes
    private String donorName;
    private double amount;

    // Constructor
    public Donation(String donorName, double amount) throws Exception {
        if (amount < 10) {
            throw new Exception("Donation amount must be at least $10.");
        }
        this.donorName = donorName;
        this.amount = amount;
    }

    // Getters and Setters
    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws Exception {
        if (amount < 10) {
            throw new Exception("Donation amount must be at least $10.");
        }
        this.amount = amount;
    }

    // Abstract method to record the donation
    public abstract void recordDonation();
}
