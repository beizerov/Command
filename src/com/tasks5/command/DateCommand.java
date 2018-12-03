package com.tasks5.command;

/**
 * The Command for displays in CLI the current date in milliseconds starting on
 * January 1, 1970 
 * 
 * 
 * ConcreteCommand
 *
 * @author serothim
 */
public class DateCommand implements Command {

    private final Date date;

    public DateCommand(Date date) {
        this.date = date;
    }

    @Override
    public void execute() {
        date.now();
    }
}
