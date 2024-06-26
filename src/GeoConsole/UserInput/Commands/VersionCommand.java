package GeoConsole.UserInput.Commands;

import GeoConsole.GeoConsole;
import GeoConsole.UserInput.Argument;
import GeoConsole.UserInput.Command;

public class VersionCommand extends Command {
    @Override
    public String getName() {
        return "version";
    }

    @Override
    public String getHelp() {
        return "Displays GeoConsole version information";
    }

    @Override
    public int getNumberOfArguments() {
        return 0;
    }

    @Override
    protected void handle(Argument[] arguments) {
        System.out.println(GeoConsole.versionInfo);
    }
}
