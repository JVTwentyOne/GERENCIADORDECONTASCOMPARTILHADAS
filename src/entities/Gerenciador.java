package entities;


import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private final List<House> houses;
    private static List<User> usuarios = new ArrayList<>();

    public Gerenciador() {
        this.houses = new ArrayList<>();
    }

    public static void cadastrarUsuario(User user) {
        usuarios.add(user);
        // Você pode incluir lógica de persistência aqui, se necessário.
    }

    public static List<User> listarUsuarios() {
        return usuarios;
    }

    // Adiciona uma nova república ao gerenciador
    public void addHouse(House house) {
        if (house == null) {
            throw new IllegalArgumentException("House cannot be null.");
        }
        this.houses.add(house);
    }

    /**
     * Verifica se existe um usuário com o email/nome de usuário e senha fornecidos.
     * Agora retorna o nome do usuário se encontrar, ou null se não.
     *
     * @param emailOrUsername O email ou nome de usuário a ser verificado.
     * @param password        A senha a ser verificada.
     * @return O nome de usuário se encontrado, ou null caso contrário.
     */
    public String authenticateUser(String emailOrUsername, String password) {
        if (emailOrUsername == null || password == null) {
            throw new IllegalArgumentException("Email/Username and password cannot be null.");
        }

        for (User user : usuarios) {
            if ((user.getEmail().equalsIgnoreCase(emailOrUsername) || user.getName().equalsIgnoreCase(emailOrUsername))
                    && user.getPassword().equals(password)) {
                return user.getName(); // Retorna o nome do usuário autenticado
            }
        }


        /*for (House house : houses) {
            for (User user : house.getUsers()) {
                if ((user.getEmail().equalsIgnoreCase(emailOrUsername) || user.getName().equalsIgnoreCase(emailOrUsername))
                        && user.getPassword().equals(password)) {
                    return user.getName(); // Retorna o nome do usuário autenticado
                }
            }
        }*/

        return null; // Retorna null se não encontrar o usuário
    }

    /**
     * Exibe o nome de todas as casas associadas a um user_name fornecido.
     *
     * @param userName O nome de usuário a ser verificado.
     */
    public void showHousesForUser(String userName) {
        if (userName == null) {
            throw new IllegalArgumentException("User name cannot be null.");
        }

        boolean found = false;
        for (House house : houses) {
            for (User user : house.getUsers()) {
                if (user.getName().equalsIgnoreCase(userName)) {
                    System.out.println("House: " + house);
                    found = true;
                    break; // Se encontrar o usuário, exibe a casa e interrompe o loop
                }
            }
        }

        if (!found) {
            System.out.println("No houses found for user: " + userName);
        }
    }
}