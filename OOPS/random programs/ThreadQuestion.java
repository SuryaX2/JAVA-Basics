class PrimeThread extends Thread {
    int n;

    public PrimeThread(int n) {
        this.n = n;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void run() {
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);
            }
        }
    }
}

class OddThread extends Thread {
    int n;

    public OddThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i < n; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenThread extends Thread {
    int n;

    public EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 2; i < n; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

public class ThreadQuestion {
    public static void main(String[] args) {
        Thread pt = new PrimeThread(10);
        Thread ot = new OddThread(10);
        Thread et = new EvenThread(10);
        pt.start();
        ot.start();
        et.start();
        try {
            pt.join();
            ot.join();
            et.join();
        } catch (Exception e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
