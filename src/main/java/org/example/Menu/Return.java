package org.example.Menu;

public class Return implements ICommand{

    @Override
    public Result execute() {
        return Result.RETURN;
    }

    @Override
    public String name() {
        return "return";
    }
}
