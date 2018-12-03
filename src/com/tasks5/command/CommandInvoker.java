package com.tasks5.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author serothim
 */
public class CommandInvoker {

    private final List<Command> history;

    public CommandInvoker() {
        this.history = new ArrayList<>();
    }

    public void executeCommand(final Command command) {
        history.add(command);
        command.execute();
    }
}
