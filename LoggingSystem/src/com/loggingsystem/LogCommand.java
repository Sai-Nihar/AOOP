package com.loggingsystem;

public class LogCommand implements Command{
	private LogHandler handler;
	
	public LogCommand(LogHandler handler) {
        this.handler = handler;
    }

	@Override
	public void execute(String message, LogLevel level) {
		// TODO Auto-generated method stub
		 handler.handleRequest(message, level);
	}

}
