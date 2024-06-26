package GeoConsole.UserInput.Commands;

import GeoConsole.UserInput.Argument;
import GeoConsole.UserInput.Command;

public class ExitCommand extends Command {
    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getHelp() {
        return "Exits console";
    }

    @Override
    public int getNumberOfArguments() {
        return 0;
    }

    @Override
    protected void handle(Argument[] arguments) {

    }
}
