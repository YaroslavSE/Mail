package org.example.Menu;

public class Help implements ICommand{
    private final String description;

    public Help(String description){
        this.description = description;
    }

    @Override
    public Result execute() {
        System.out.println(description);
        return Result.CONTINUE;
    }

    @Override
    public String name() {
        return "help";
    }
}
