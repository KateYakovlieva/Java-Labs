package com.tasks5.command;

public class DateNow implements Command {
   
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
package com.tasks5.command;

public class Echo implements Command {

    private String message;

    public Echo(String msg) {
        message = msg;
    }

    
    public void execute() {
        System.out.print(message);
    }
}

package com.tasks5.command;

public class Exit implements Command {
    
    public void execute() {
        System.out.print("Goodbye!");
    }
}
package com.tasks5.command;

public class Help implements Command {
 
    public void execute() {
        System.out.print("Help executed");
    }
}


package com.tasks5.command;

public class Application {

    public static void main(String[] args) {
        Command currentCommand;

        if (args != null && (args.length == 1 || args.length == 2)) {
            switch (args.length) {
                case 1:
                    switch (args[0]) {
                        case "help":
                            currentCommand = new Help();
                            break;
                        case "exit":
                            currentCommand = new Exit();
                            break;
                        default:
                            System.out.print("Error");
                            return;
                    }
                    break;
                case 2:
                    switch (args[0]) {
                        case "echo":
                            currentCommand = new Echo(args[1]);
                            break;
                        case "date":
                            if (args[1].equals("now")) {
                                currentCommand = new DateNow();
                            } else {
                                System.out.print("Error");
                                return;
                            }
                            break;
                        default:
                            System.out.print("Error");
                            return;
                    }
                    break;
                default:
                    System.out.print("Error");
                    return;
            }

            currentCommand.execute();
        } else {
            System.out.print("Error");
        }
    }
}
