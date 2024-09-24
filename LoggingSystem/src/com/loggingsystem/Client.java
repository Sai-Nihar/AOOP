package com.loggingsystem;

public class Client {
  public static void main(String[] args) {
       
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
       
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Command logInfoCommand = new LogCommand(infoHandler);
        Command logDebugCommand = new LogCommand(infoHandler);  
        Command logErrorCommand = new LogCommand(infoHandler);  

        Logger logger = new Logger();
        logger.addCommand(logInfoCommand);
        logger.addCommand(logDebugCommand);
        logger.addCommand(logErrorCommand);

        logger.processCommands();

        System.out.println("Testing different log levels");
        logInfoCommand.execute("This is an INFO message", LogLevel.INFO);
        logDebugCommand.execute("This is a DEBUG message", LogLevel.DEBUG);
        logErrorCommand.execute("This is an ERROR message", LogLevel.ERROR);
    }

}
