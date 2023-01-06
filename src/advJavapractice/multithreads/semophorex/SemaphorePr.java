package advJavapractice.multithreads.semophorex;

import java.util.concurrent.Semaphore;

/*
Semaphore bir kaynağa erişebilen iş parçacığı sayısını kısıtlamak için kullanılır.
Yani, synchronized sadece bir iş parçacığının kilitlenmesi ve
senkronize blok / yöntemi yürütmesine izin verirken, Semaphore n iş parçacığına kadar izin verir
ve diğerlerini engeller.

senaryo:deneme kabini/ödeme kasası
Mağazanın 3 deneme kabini var. 5 kişi mağazanın deneme kabinini
kullanmak istiyor. Bu 5 tane işlem için 5 thread kullanılsın.
*/
public class SemaphorePr {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

    }

}

class Person extends Thread{
    private String name ;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(name+ " kabine girmek istiyor...");
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
