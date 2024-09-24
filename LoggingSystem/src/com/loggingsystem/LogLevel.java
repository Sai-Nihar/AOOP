package com.loggingsystem;

public class LogLevel {
	public static final LogLevel INFO = new LogLevel("INFO");
    public static final LogLevel DEBUG = new LogLevel("DEBUG");
    public static final LogLevel ERROR = new LogLevel("ERROR");

    private String level;

    private LogLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }
}
