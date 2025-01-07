package com.chamalidev.mutithreading;

public class SharedCounter {
    private int count = 0;

    // synchronized method ensures thread safety
    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args){
        final SharedCounter counter = new SharedCounter();

        Runnable task = ()->{
            for (int i=0;i<10000;i++){
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Final count : "+counter.getCount()); //Final count : 20000
    }
}
