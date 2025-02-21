class MyThread1 extends Thread{
    
     public void run(){
        int i = 0 ;
        while(i<=10){
            try{
                Thread.sleep(1000);
                System.out.println(i);
                i++;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
     }
}

public class PrintZeroToTen{
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t.start();
        t1.start();
        t2.start();
     
        try{
            t.join();
            t1.join();
            t2.join();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}