package com.tasks5.command;

/**
 * The Command for displays string "Goodbye!" in CLI.
 * 
 * 
 * ConcreteCommand
 * 
 * @author serothim
 */
public class ExitCommand implements Command{
    private final Exit exit;

    public ExitCommand(Exit exit) {
        this.exit = exit;
    }

    @Override
    public void execute() {
        exit.exit();
    }
}
