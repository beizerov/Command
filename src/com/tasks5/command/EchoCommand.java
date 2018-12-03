package com.tasks5.command;

/**
 * The Command for displays string in CLI.
 * 
 * Example:
 *      echo "Sample text"
 *
 * Out: 
 *      Sample text 
 * 
 * 
 * ConcreteCommand
 *
 * @author serothim
 */
public class EchoCommand implements Command {

    private final Echo echo;

    public EchoCommand(Echo echo) {
        this.echo = echo;
    }

    @Override
    public void execute() {
        echo.echo();
    }
}
