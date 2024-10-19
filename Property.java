public class Property {
    // Attributes
    private String propertyID;
    private String description;
    private String propertyOwnerId;

    // Constructor
    public Property(String propertyID, String description, String propertyOwnerId) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }

    // Getters and Setters
    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPropertyOwnerId() {
        return propertyOwnerId;
    }

    public void setPropertyOwnerId(String propertyOwnerId) {
        this.propertyOwnerId = propertyOwnerId;
    }

    // Method to create a new property (empty)
    public static Property createProperty(String propertyID, String description, String propertyOwnerId) {
      
        return null; 
    }

    // Method to remove a property (empty)
    public void removeProperty() {
        
    }

    // Method to display property details (for testing)
    public void displayPropertyDetails() {
        System.out.println("Property ID: " + propertyID);
        System.out.println("Description: " + description);
        System.out.println("Property Owner ID: " + propertyOwnerId);
    }
}