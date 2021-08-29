package org.worker.design.command;

import java.util.ArrayList;
import java.util.List;

public class ControlPanel {

    private List<ICommand> commands = new ArrayList<>();

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public void doCommands() {
        for(ICommand command : commands) {
            command.execute();
        }
    }
}
