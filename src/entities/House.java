import java.util.ArrayList;
import java.util.List;


class House {
    private final String name; // Nome da república
    private final List<Account> accounts;
    private final List<User> users;

    public House(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("House name cannot be null or empty.");
        }
        this.name = name;
        this.accounts = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null.");
        }
        this.accounts.add(account);
    }

    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        // Verifica se o email ou nome de usuário já existe na casa
        for (User existingUser : users) {
            if (existingUser.getEmail().equalsIgnoreCase(user.getEmail()) ||
                existingUser.getName().equalsIgnoreCase(user.getName())) {
                throw new IllegalArgumentException("User with the same email or username already exists in this house.");
            }
        }
        this.users.add(user);
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts); // Retorna uma cópia da lista
    }

    public List<User> getUsers() {
        return new ArrayList<>(users); // Retorna uma cópia da lista
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "House{name='" + name + "', users=" + users.size() + ", accounts=" + accounts.size() + "}";
    }
}
