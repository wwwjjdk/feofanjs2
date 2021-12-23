package com.company;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = x -> System.out.println(x);
        OnTaskErrorListener error = x -> System.out.println(x);

        Worker worker = new Worker(listener,error);
        worker.start();
    }
}
