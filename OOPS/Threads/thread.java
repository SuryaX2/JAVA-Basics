import java.io.*;

class ThreadJoining extends Thread {
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(300);
                System.out.println("Current Thread   : " + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has" + " been caught" + ex);
            }
            System.out.println(i);
        }
    }
}

class thread {
    public static void main(String[] args) {
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        t1.start();
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        t1.join();

        t2.start();
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        t2.join();
    }
}