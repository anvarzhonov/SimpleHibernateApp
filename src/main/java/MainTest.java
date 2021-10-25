import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class MainTest {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User user = new User("Alesha", 12);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari","red");
        ferrari.setUser(user);
        user.addAuto(ferrari);

        Auto ford = new Auto("Ford", "pink");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);

    }
}
