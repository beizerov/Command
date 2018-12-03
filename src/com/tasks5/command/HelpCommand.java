package com.tasks5.command;

/**
 * The Command for displays string "Help executed" in CLI.
 * 
 * 
 * ConcreteCommand
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
