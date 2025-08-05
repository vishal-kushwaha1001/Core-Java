package com.multithreading;

public class MyThread extends  Thread{
    public MyThread(String name){
        super(name);
    }
    public  void run(){
        System.out.println("thread is running");
        System.out.println( "Name of thread is :" +  Thread.currentThread().getName() +"  And state is :" + Thread.currentThread().getState());

    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("vishal");
        t1.start();
    }
}
