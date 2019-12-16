package com.tasks5.command;

/**
 * The Client class
 * 
 * @author serothim
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args != null && args.length != 0 && args[0] != null) {
            CommandInvoker invoker = new CommandInvoker();

            switch (args.length) {
                case 1:
                    switch (args[0]) {
                        case "help":
                            invoker.executeCommand(
                            		new HelpCommand(new Help())
                            );
                            break;
                        case "exit":
                            invoker.executeCommand(
                            		new ExitCommand(new Exit())
                            );
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                case 2:
                    switch (args[0]) {
                        case "echo":
                            if (args[1] == null) {
                                System.out.println("Error");
                                return;
                            } else {
                                invoker.executeCommand(
                                		new EchoCommand(new Echo(args[1]))
                                );
                                break;
                            }
                        case "date":
                            if ("now".equals(args[1])) {
                                invoker.executeCommand(
                                		new DateCommand(new Date())
                                );
                            } else {
                                System.out.println("Error");
                            }
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } else {
        	System.out.println("Error");
        }
    }
}
