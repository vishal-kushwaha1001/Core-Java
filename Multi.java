package com.multithreading;

 class Multi extends Thread{
     public void run(){
         System.out.println("thread is running");
         System.out.println(Thread.currentThread().getState());
         System.out.println("Name of the thread  in  run method:" + Thread.currentThread().getName());
     }

     public static void main(String[] args) {
         Multi m = new Multi();
         m.start();
         m.setName("vishal");
         System.out.println( "Name of thread in main method is :" + m.getName() +"  And state is :" + Thread.currentThread().getState());
         System.out.println("Thread is terminated");
         System.out.println(m.getState());

     }
}
