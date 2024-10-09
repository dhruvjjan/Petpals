package entity.model;

public class ItemDonation extends Donation {
    // Additional attribute
    private String itemType;

    // Constructor
    public ItemDonation(String donorName, double amount, String itemType) throws Exception {
        super(donorName, amount); // Call the Donation constructor
        this.itemType = itemType;
    }

    // Getter and Setter for itemType
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    // Implementation of the recordDonation method
    @Override
    public void recordDonation() {
        System.out.println("Recording item donation of " + itemType + " worth $" + getAmount() + " from " + getDonorName());
    }
}
