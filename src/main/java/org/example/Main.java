package org.example;


import org.example.Menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        User reciever = new User(1,"Abla", "Blabla");
//        Mail mail = MailBuilder.create().itemId(10).reciever(reciever).build();
//        System.out.println(mail.getItemId());
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        List<PostOffice> offices = new ArrayList<>();

        CommandMenu mainMenu = new CommandMenu("Main Menu", scanner);

        mainMenu.add(new CreateUser(scanner, users));
        mainMenu.add(new CreatePostOffice(scanner,offices));
        mainMenu.add(new Help("Commands: create_user, create_post_oficce, help, return, exit"));
        mainMenu.add(new Return());
        mainMenu.add(new Exit());

        mainMenu.execute();
        System.out.println("Program terminated.");
    }
}