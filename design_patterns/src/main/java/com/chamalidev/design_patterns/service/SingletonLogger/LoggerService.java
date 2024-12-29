package com.chamalidev.design_patterns.service.SingletonLogger;

public class LoggerService {
    // static variable to hold the single instance
    public static LoggerService instance;

    // private constructor to prevent instantiation from outside
    private LoggerService() {
        // empty - to prevent other classes
        // from creating instances
    }

    // public method to provide access to the single instance
    // synchronized - thread-safe
    public static synchronized LoggerService getInstance(){
        // lazy initialization - memory efficient
        if(instance == null){
            instance = new LoggerService();
        }
        return instance;
    }

    // example logging method
    public void log(String msg){
        System.out.println("[LOG] "+msg);
    }

}
