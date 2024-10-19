public class User {
    // Attributes
    private String userID;
    private String password;
    private String email;
    private String userType;

    // Constructor
    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    // Operations


    public static User createUser(String userID, String password, String email, String userType) {

        return null; 
    }


    public void resetPassword(String newPassword) {
     
    }

    // Method to display user details
    public void displayUserDetails() {
        System.out.println("UserID: " + userID);
        System.out.println("Email: " + email);
        System.out.println("UserType: " + userType);
    }
}
