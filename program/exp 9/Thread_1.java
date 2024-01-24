public class thread1 extends Thread {
     public void run(){
        for(int i=0;i<10;i++)
        System.out.println("i");
    }
     public static void main(String[] args) {
        thread1 t = new thread1();
        t.start();
    }
}

