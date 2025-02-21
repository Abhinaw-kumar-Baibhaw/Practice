class  Thread1 extends Thread{
    String name;
    int age;
    Thread1(String name, int age){
        this.name = name;
        this.age = age;
    }
    
   public void run(){
        int count = 0;
        while(count<5){
            try{
                Thread.sleep(500);
                count++;
                System.out.println("Name is :" + name +" and age is : "+ age);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        Thread1 t = new Thread1("abhinaw",24);
        t.start();
        try{
            t.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}