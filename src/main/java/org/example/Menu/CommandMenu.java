package org.example.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandMenu implements ICommand{
    private final String name;
    private final Scanner scanner;
    private final Map<String, ICommand> commands = new HashMap<>();

    public CommandMenu(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    @Override
    public Result execute() {
        if(commands.isEmpty()) {
            System.out.println("Menu is empty. Returning");
        }
        Result result;
        do{
            result = Result.CONTINUE;
            prompt();
            String commandName = scanner.nextLine();
            ICommand command = commands.get(commandName);
            if(command != null){
                result = command.execute();
            } else {
                System.out.println("Command not found. Try again");
            }
        } while (result == Result.CONTINUE);
        return result == Result.EXIT ? Result.EXIT : Result.CONTINUE;

    }

    @Override
    public String name() {
        return name;
    }

    public void add(ICommand command){
        commands.put(command.name(), command);
    }
    private void prompt(){
        String commandName = String.join(", ", commands.keySet());
        System.out.println("Enter one of the commands: " + commandName);
        System.out.print("> ");
    }
}
