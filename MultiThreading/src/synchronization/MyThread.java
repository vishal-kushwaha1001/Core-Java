package synchronization;

 class MyThread extends  Thread {
     private  Counter counter;

     MyThread(Counter c){
         this.counter = c;
     }
     public  void run(){
         for(int i  = 0 ; i<1000 ; i++){
             counter.increment();
         }
     }
}
