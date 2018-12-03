package com.tasks5.command;

/**
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
