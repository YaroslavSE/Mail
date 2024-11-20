package org.example.Menu;
import java.util.List;
import java.util.Scanner;

import org.example.PostOffice;

public class CreatePostOffice implements ICommand{
    private final Scanner scanner;
    private final List<PostOffice> postOffices;

    public CreatePostOffice(Scanner scanner, List<PostOffice> postOffices) {
        this.scanner = scanner;
        this.postOffices = postOffices;
    }

    @Override
    public Result execute() {
        System.out.println("Enter Post Office ID:");
        int officeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Post Office Location:");
        String location = scanner.nextLine();

        PostOffice postOffice = new PostOffice(officeId, location);
        System.out.println("Post Office created: ID " + postOffice.getOfficeId() + ", Location: " + postOffice.getLocation());
        return Result.CONTINUE;
    }

    @Override
    public String name() {
        return "create_post_office";
    }
}
