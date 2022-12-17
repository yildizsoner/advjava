package Threads;



public class ThreadCreationWays {
    public static void main(String[] args) {
        // Ilk calisan thread main thread'dir, Kontrol edelim:
        System.out.println("Current Thread : "+ Thread.currentThread().getName());

        MyThread thread1 = new MyThread();
        //thread1.run();  // single task gibi calisir.
        thread1.start();
        /* thread sinifinda run() da yazilanlar islenmeye baslar.
        run() diyerek cagirdigimizda method yine calisiyor, start() ile cagrimamiz  arasindaki
        fark : run ile cagirdigimizda thread degismez sadece method calisir. start da ise
        once thread ayaga kalkar daha sonra icindeki run() methodu calisir.*/

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);  //thread turune cevirmek gerekiyor.instance variable olusturduk
        thread2.start();

        // !!! isimsiz olarak thread olusturma, anonymous (Interface)
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000); // 5 saniye uyu
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Thread : "+Thread.currentThread().getName());
                System.out.println("Bu isimsiz sinif yoluyla olusturulan is parcacigidir.");
            }
        });
       // thread3.setName("Thread3");  //thread3 e isim verdik.
        thread3.start();

        // !!! isimsiz olarak thread olusturalim 2. yol:
        Thread thread4 = new Thread(()->{
            System.out.println("lambda ile yazildi");
        });
        thread4.start();
        System.out.println("Mainmethod bitti");

        Thread thread5 = new Thread(()->{
            System.out.println("thread5 calisti");
        });
        thread5.start();

    }

    // 1. yol: Thread classini extend ederek:
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread thread i calisiyor");
    }
}

//2/ yol: runnable Interfacei implement ederek:
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable interfaceden turetilen thread calisti");
    }
}