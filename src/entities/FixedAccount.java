package entities;
// FixedAccount class
class FixedAccount extends Account {
    public FixedAccount(String title, String description) {
        super(title, description);
    }

    @Override
    public String generateReport() {
        return "Fixed Account Report:\n" +
                "Title: " + getTitle() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Number of Payment Managers: " + getPaymentManagers().size();
    }
}
