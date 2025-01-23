public class UserPayment {
    private final User user;
    private double amountDue;
    private double amountPaid;

    
    public UserPayment(User user, double amountDue) {
        if (user == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo.");
        }
        if (amountDue < 0) {
            throw new IllegalArgumentException("O valor a ser pago não pode ser negativo.");
        }
        this.user = user;
        this.amountDue = amountDue;
        this.amountPaid = 0.0;
    }

    public User getUser() {
        return user;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void registerPayment(double amountPaid) {
        if (amountPaid <= 0) {
            throw new IllegalArgumentException("O valor pago deve ser maior que zero.");
        }
        this.amountPaid += amountPaid;
        this.amountDue = Math.max(0.0, this.amountDue - amountPaid); // Garante que `amountDue` nunca seja negativo
    }

    public boolean isFullyPaid() {
        return amountDue == 0.0;
    }

    @Override
    public String toString() {
        return "UserPayment{" +
                "user=" + user.getName() +
                ", amountDue=" + amountDue +
                ", amountPaid=" + amountPaid +
                '}';
    }
}
