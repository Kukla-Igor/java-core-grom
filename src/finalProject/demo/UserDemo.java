package finalProject.demo;

import finalProject.Controller.UserController;
import finalProject.UserType;
import finalProject.model.User;

public class UserDemo {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();

        User user = new User("Anton", "password", "Kiev", UserType.USER);

        System.out.println(userController.registerUser(user));
    }
}
