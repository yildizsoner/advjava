package advJavapractice.multithreads.creation;
/*

1) Multithreading Programlama nedir?
    Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma süreci
2) Threadler 2 şekilde oluşturulur:
        --Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.

         --Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,
         ardından Thread sınıfının constructorına nesne olarak gönderilir.
         2a) Hangi yontem daha kullanisli?
         Genellikle runnable interfaceini implement ederek olsuturmak daha cok tercih edilir.
         cunku : Javada sadece bir class extend edebiliriz bu hakkimizi thread ile harcamak istemeyiz.
3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?
   Evet, ancak thread oluşturulmaz.
4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?
   Java varsayılan olarak tüm uygulamalarda main threadini  kullanılır.
*/
public class ThreadCreation1 {
    /*
    Task1: Thread sınıfını extend eden Sayac isminde sınıf oluşturup
    bu sınıftan sayıları 1 den 100 e kadar yazdıran iki tane thread oluşturunuz.
     */
    public static void main(String[] args) {
        Sayac thread1 = new Sayac("Ronaldo");
        Sayac thread2 = new Sayac ("Messi");
        thread1.start();
        thread2.start();




    }


}

