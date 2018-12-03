package com.tasks5.command;

/**
 *
 * @author serothim
 */
public class HelpCommand implements Command {

    private final Help help;

    public HelpCommand(Help help) {
        this.help = help;
    }

    @Override
    public void execute() {
        help.helpExecuted();
    }
}
