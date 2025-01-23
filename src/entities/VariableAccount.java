// VariableAccount class
class VariableAccount extends Account {
    public VariableAccount(String title, String description) {
        super(title, description);
    }

    @Override
    public String generateReport() {
        return "Variable Account Report:\n" +
                "Title: " + getTitle() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Payment Manager Details:\n" +
                getPaymentManagers();
    }
}
