import java.util.ArrayList;
import java.util.List;


public class Gerenciador {
    private final List<House> houses;

    public Gerenciador() {
        this.houses = new ArrayList<>();
    }

    public void addHouse(House house) {
        if (house == null) {
            throw new IllegalArgumentException("House cannot be null.");
        }
        this.houses.add(house);
    }

    public String authenticateUser(String emailOrUsername, String password) {
        if (emailOrUsername == null || password == null) {
            throw new IllegalArgumentException("Email/Username and password cannot be null.");
        }

        for (House house : houses) {
            for (User user : house.getUsers()) {
                if ((user.getEmail().equalsIgnoreCase(emailOrUsername) || user.getName().equalsIgnoreCase(emailOrUsername))
                        && user.getPassword().equals(password)) {
                    return user.getName();
                }
            }
        }

        return null;
    }

    public boolean isUserExists(String userName, String email) {
        for (House house : houses) {
            for (User user : house.getUsers()) {
                if (user.getName().equalsIgnoreCase(userName) || user.getEmail().equalsIgnoreCase(email)) {
                    return true; // Retorna true se encontrar duplicado
                }
            }
        }
        return false; // Retorna false se não encontrar
    }

    public void registerUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo.");
        }
        // Adiciona o usuário na primeira casa ou cria uma casa padrão para novos usuários
        if (houses.isEmpty()) {
            House defaultHouse = new House();
            defaultHouse.addUser(user);
            houses.add(defaultHouse);
        } else {
            houses.get(0).addUser(user); // Adiciona o usuário na primeira casa
        }
    }
    

    public void showHousesForUser(String userName) {
        if (userName == null) {
            throw new IllegalArgumentException("User name cannot be null.");
        }

        boolean found = false;
        for (House house : houses) {
            for (User user : house.getUsers()) {
                if (user.getName().equalsIgnoreCase(userName)) {
                    System.out.println("House: " + house.getName());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No houses found for user: " + userName);
        }
    }
}
