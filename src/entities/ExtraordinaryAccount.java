// ExtraordinaryAccount class
package entities;
class ExtraordinaryAccount extends Account {
    public ExtraordinaryAccount(String title, String description) {
        super(title, description);
    }

    @Override
    public String generateReport() {
        return "Extraordinary Account Report:\n" +
                "Title: " + getTitle() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Summary of extraordinary payments attached.";
    }
}