package Threads;

public class MultiThreading03 {
    public static void main(String[] args) {
        Brackets brackets =new Brackets();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=7; i++){
                    brackets.generateBrackets();
                }
            }
        });
        thread1.start();

        //thread2:
        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=7 ; i++) {
                    brackets.generateBrackets();

                }
            }
        });
        thread2.start();
    }

}

class Brackets{
    // ciktinin duzgun gozukebilmesi icin bu methoda ayni anda 1 threadin girebiliyor olmasi icin synchronized
    //kullandik.
    public synchronized void generateBrackets(){
        for(int i=1; i<=10; i++){

            if(i<=5){
                System.out.print("[");
            }else {
                System.out.print("]");
            }

        }
        System.out.println("");
    }


}