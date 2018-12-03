package com.tasks5.command;

/**
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
