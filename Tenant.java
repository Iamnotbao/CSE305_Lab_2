import java.util.ArrayList;
import java.util.List;

public class Tenant {
    // Attributes
    private User user;  // The tenant user
    private List<RentalContract> listOfContracts;  // List of rental contracts for the tenant

    // Constructor
    public Tenant(User user) {
        this.user = user;
        this.listOfContracts = new ArrayList<>();
    }

    // Method to request creating a rental contract (empty)
    public void requestCreateRentalContract(RentalContract contract) {
      
    }

    // Method to request terminating a rental contract (empty)
    public void requestTerminateRentalContract(RentalContract contract) {
       
    }

    // Method to display rental contracts (for testing)
    public void displayContracts() {
        System.out.println("Contracts for Tenant: " + user.getUserID());
        for (RentalContract contract : listOfContracts) {
            contract.displayContractDetails();
        }
    }
}