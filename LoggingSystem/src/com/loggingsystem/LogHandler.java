package com.loggingsystem;

public abstract class LogHandler {
	 protected LogHandler nextHandler;

	    public void setNextHandler(LogHandler nextHandler) {
	        this.nextHandler = nextHandler;
	    }

	    public abstract void handleRequest(String message, LogLevel level);

}