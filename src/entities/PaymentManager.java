import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentManager {
    private LocalDate validityDate; // Data de validade para pagamentos
    private final List<UserPayment> paymentRecords; // Lista de pagamentos dos usuários

    public PaymentManager(LocalDate validityDate) {
        if (validityDate == null) {
            throw new IllegalArgumentException("A data de validade não pode ser nula.");
        }
        this.validityDate = validityDate;
        this.paymentRecords = new ArrayList<>();
    }

    public void addUser(User user, double amountDue) {
        if (findUserPayment(user) == null) { // Garante que não haja duplicatas
            paymentRecords.add(new UserPayment(user, amountDue));
        }
    }

    public void registerPayment(User user, double amountPaid) {
        UserPayment userPayment = findUserPayment(user);
        if (userPayment != null) {
            userPayment.registerPayment(amountPaid);
        }
    }

    public void removeUser(User user) {
        UserPayment userPayment = findUserPayment(user);
        if (userPayment != null) {
            paymentRecords.remove(userPayment);
        }
    }

    public List<UserPayment> listUserPayments() {
        return new ArrayList<>(paymentRecords); // Retorna uma cópia para proteger os dados internos
    }

    public LocalDate getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(LocalDate validityDate) {
        if (validityDate == null) {
            throw new IllegalArgumentException("A data de validade não pode ser nula.");
        }
        this.validityDate = validityDate;
    }

    private UserPayment findUserPayment(User user) {
        for (UserPayment userPayment : paymentRecords) {
            if (userPayment.getUser().equals(user)) {
                return userPayment;
            }
        }
        return null; // Usuário não encontrado
    }

    @Override
    public String toString() {
        return "PaymentManager{" +
                "validityDate=" + validityDate +
                ", paymentRecords=" + paymentRecords +
                '}';
    }
}
