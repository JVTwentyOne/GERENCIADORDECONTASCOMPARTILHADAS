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
