import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
    // Attributes
    private User user;  // The owner of the property
    private List<Property> listOfProperties;  // List of properties owned by the user

    // Constructor
    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    // Method to add a property (empty)
    public void addProperty(Property property) {
        // Empty operation
    }

    // Method to remove a property (empty)
    public void removeProperty(Property property) {
        // Empty operation
    }

    // Method to display owned properties (for testing)
    public void displayOwnedProperties() {
        System.out.println("Properties owned by: " + user.getUserID());
        for (Property property : listOfProperties) {
            property.displayPropertyDetails();
        }
    }
}
