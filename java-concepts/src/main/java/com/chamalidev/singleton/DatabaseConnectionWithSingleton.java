package com.chamalidev.singleton;

public class DatabaseConnectionWithSingleton {
    private static DatabaseConnectionWithSingleton instance;

    // private constructor
    private DatabaseConnectionWithSingleton(){
        System.out.println("Establishing a single database connection..");
    }

    // static method - to provide a single point of access to instance
    public static synchronized DatabaseConnectionWithSingleton getInstance(){
        if(instance==null){
            instance = new DatabaseConnectionWithSingleton();
        }
        return instance;
    }

    public void query(String SQL){
        System.out.println("Executing query : "+SQL);
    }

    public static void main(String[] args){
        DatabaseConnectionWithSingleton connection1 = DatabaseConnectionWithSingleton.getInstance();
        DatabaseConnectionWithSingleton connection2 = DatabaseConnectionWithSingleton.getInstance();
        // Establishing a single database connection.. is printed only once
    }
}
