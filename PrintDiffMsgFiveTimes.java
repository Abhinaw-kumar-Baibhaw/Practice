class Thread2 extends Thread{
    String msg;
    Thread2(String msg){
        this.msg=msg;
    }
    public void run(){
        int i = 0;
        while(i<=4){
            try{
                i++;
                Thread.sleep(1000);
                System.out.println(msg);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class PrintDiffMsgFiveTimes {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2("My name is abhinaw");
        Thread2 t2 = new Thread2("My surname is baibhaw");
        Thread2 t3 = new Thread2("I graduated in 2024");
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
