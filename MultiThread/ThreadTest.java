 class MyThread extends Thread {
    private int i = 0;
     
    @Override
    public void run() {
        for (i = 0; i < 10; i++) {
            System.out.println(
                Thread.currentThread().getName() + " " + i);
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 3) {
                Thread myThread1 = new MyThread();
                Thread myThread2 = new MyThread();
                myThread1.start();                     
                myThread2.start();                   
            }
        }
    }
}