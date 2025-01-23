// House class

import java.util.ArrayList;
import java.util.List;

class House {
    private final List<Account> accounts;
    private final List<User> users;

    public House() {
        this.accounts = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null.");
        }
        this.accounts.add(account);
    }

    // Method to add a user
    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        this.users.add(user);
    }

    // Accessor methods
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts); // Returns a copy of the list
    }

    public List<User> getUsers() {
        return new ArrayList<>(users); // Returns a copy of the list
    }
}
