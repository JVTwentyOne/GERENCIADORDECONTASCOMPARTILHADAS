package entities;
import java.util.ArrayList;
import java.util.List;

// Abstract class Account
public abstract class Account {
    private String title;
    private String description;
    private final List<PaymentManager> paymentManagers;

    public Account(String title, String description) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
        this.title = title;
        this.description = description;
        this.paymentManagers = new ArrayList<>();
    }

    // Methods to edit title and description
    public void editTitle(String newTitle) {
        if (newTitle == null || newTitle.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = newTitle;
    }

    public void editDescription(String newDescription) {
        if (newDescription == null || newDescription.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
        this.description = newDescription;
    }

    // Method to add a PaymentManager
    public void addPaymentManager(PaymentManager paymentManager) {
        if (paymentManager == null) {
            throw new IllegalArgumentException("PaymentManager cannot be null.");
        }
        this.paymentManagers.add(paymentManager);
    }

    // Accessor methods
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<PaymentManager> getPaymentManagers() {
        return new ArrayList<>(paymentManagers); // Returns a copy of the list
    }

    // Abstract method to generate a report
    public abstract String generateReport();
}




