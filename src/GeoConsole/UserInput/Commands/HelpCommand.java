package GeoConsole.UserInput.Commands;

import GeoConsole.UserInput.Argument;
import GeoConsole.UserInput.Command;
import GeoConsole.UserInput.CommandFactory;

public class HelpCommand extends Command {
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getHelp() {
        return "Displays available commands";
    }

    @Override
    public int getNumberOfArguments() {
        return 0;
    }

    @Override
    protected void handle(Argument[] arguments) {
        var builder = new StringBuilder();
        CommandFactory.forEachInstance((key, command) ->
            builder.append(String.format("%s\t%s\n", key, command.getHelp())));
        System.out.println(builder);
    }
}
