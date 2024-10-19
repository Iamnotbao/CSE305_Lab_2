import java.util.ArrayList;
import java.util.List;

public class RegisteredUser {
    // Attributes
    private List<User> listOfUsers;

    // Constructor
    public RegisteredUser() {
        this.listOfUsers = new ArrayList<>();
    }

    // Method to add a user (empty)
    public void addUser(User user) {
        // Empty operation
    }

    // Method to remove a user (empty)
    public void removeUser(User user) {
        // Empty operation
    }

    // Method to display users (for testing)
    public void displayUsers() {
        System.out.println("List of Registered Users:");
        for (User user : listOfUsers) {
            user.displayUserDetails();
        }
    }
}