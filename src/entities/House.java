package entities;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Account> accounts;
    private List<User> users;
    private String nome;
    private String endereco;

    public House(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
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
        this.users.add(user);
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts); // Returns a copy of the list
    }

    public List<User> getUsers() {
        return new ArrayList<>(users); // Returns a copy of the list
    }
}