package org.example.Menu;

public class Exit implements  ICommand{
    @Override
    public Result execute() {
        return Result.EXIT;
    }

    @Override
    public String name() {
        return "exit";
    }
}
