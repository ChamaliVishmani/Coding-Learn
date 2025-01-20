package com.chamalidev.mutithreading;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
//            System.out.println(myThread.isAlive());//true or false whether thread is still running
//            myThread.join();//waits for the thread to die
        }
    }
}
