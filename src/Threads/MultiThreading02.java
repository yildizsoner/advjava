package Threads;

// threadler ayni kaynaga erismek isterlerse ne olacak?
public class MultiThreading02 {
    public static int counter = 0;

    public static void main(String[] args) {
// !!!  ayri iki thread olusturup ayni kaynaga erismesini saglayalim...
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread1 calisti");
            }
        });
        thread1.start();

            //thread1.join(); bu cozum degil


        //2. thread olusturalim:
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread2 calisti");
            }
        });

        thread2.start();

    }

}

class Counter {
    public synchronized static void count() { //synchronized ile metoda giren threadler siraya kondu.
        // method icine ayni anda sadece 1 thread girebilecek.
        for (int i = 1; i <= 1000; i++) {
            MultiThreading02.counter++;
        }
        System.out.println("counter : " + MultiThreading02.counter);
    }
}