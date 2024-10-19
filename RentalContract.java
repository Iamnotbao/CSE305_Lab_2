public class RentalContract {
    // Attributes
    private String contractID;   // Unique identifier for the rental contract
    private String propertyID;    // ID of the property associated with the contract
    private String tenantID;      // ID of the tenant associated with the contract
    private double rentAmount;     // Rent amount for the property

    // Constructor
    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    // Getters and Setters
    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    // Method to create a new rental contract (empty)
    public static RentalContract CreateContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        // Empty operation
        return null; // or throw an UnsupportedOperationException if preferred
    }

    // Method to terminate the rental contract (empty)
    public void TerminateContract() {
        // Empty operation
    }

    // Method to display contract details (for testing)
    public void displayContractDetails() {
        System.out.println("Contract ID: " + contractID);
        System.out.println("Property ID: " + propertyID);
        System.out.println("Tenant ID: " + tenantID);
        System.out.println("Rent Amount: $" + rentAmount);
    }
}