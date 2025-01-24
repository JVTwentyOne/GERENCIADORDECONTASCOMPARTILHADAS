package entities;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Account> accounts;
    private List<User> users;
    private String nome;
    private String endereco;

    // Construtor que recebe nome e endereço
    public House(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.accounts = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Getter para nome
    public String getName() {
        return nome;
    }

    // Getter para endereço
    public String getEndereco() {
        return endereco;
    }

    // Método para adicionar uma conta à casa
    public void addAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null.");
        }
        this.accounts.add(account);
    }

    // Método para adicionar um usuário à casa
    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        this.users.add(user);
    }

    // Método para obter a lista de contas associadas à casa
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts); // Retorna uma cópia da lista
    }

    // Método para obter a lista de usuários associados à casa
    public List<User> getUsers() {
        return new ArrayList<>(users); // Retorna uma cópia da lista
    }
}
