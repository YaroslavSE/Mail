package org.example.Menu;
import java.util.List;
import org.example.User;

import java.util.Scanner;

public class CreateUser implements ICommand {
    private final Scanner scanner;
    private final List<User> users;

    public CreateUser(Scanner scanner, List<User> users){
        this.scanner = scanner;
        this.users = users;
    }


    @Override
    public Result execute() {
        System.out.println("Enter User ID:");
        int userId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter User Name:");
        String name = scanner.nextLine();
        System.out.println("Enter User Address");
        String address = scanner.nextLine();

        User user = new User(userId, name, address);
        users.add(user);
        System.out.println("User created: " + user.getName() + " (" + user.getAddress() + ")");
        return Result.CONTINUE;
    }

    @Override
    public String name() {
        return "create_user";
    }
}
