package com.tasks5.command;

/**
 *
 * @author serothim
 */
public class Echo {

    private final String text;

    public Echo(String string) {
        this.text = string;
    }

    public void echo() {
        System.out.println(text);
    }
}
