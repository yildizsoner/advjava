package advJavapractice.multithreads.Volatile;

public class Numerator {
    private volatile static int counter = 0;

    // volatile keyword'u degiskenin main memoy de saklanmasini garnti eder.
    // Ancak tum thread'lerin degiskene ayni anda ulasmasindan cakismaya cozme garnatisi yoktur.
    // Bunun icin synchronized keywordu de kullanilmali.
    public void getOrder() {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            counter++;
            System.out.println("Sayin " + name + " siraniz : " + counter);
        }
    }
}
