package com.tasks5.command;

/**
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
