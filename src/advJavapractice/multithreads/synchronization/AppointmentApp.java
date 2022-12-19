package advJavapractice.multithreads.synchronization;
//Multithreading programlamada birden fazla Thread aynı anda ortak bir kaynağa erişmeye çalışırsa
//istenmeyen sonuçlar oluşacaktır. Bu durumda threadlere sırayla erişim vermek gerekecektir.
// Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler. Bu "synchronized" keywordü ile sağlanır.

/*
Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir.
      synchrno method sadece method ve bloglarda kullanilir.
*/
public class AppointmentApp {
    public static void main(String[] args) {
        String[] users = {"Tolstoy", "VictorHugo", "Balzac", "Dosyoyevski", "JohnSteinback"};
        AppointmentCenter appointmentCenter = new AppointmentCenter();
        for (String user : users) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread.currentThread().setName(user);
                    String name = Thread.currentThread().getName();
                    System.out.format("Sayin %-16s, Randevu tarihiniz: %10s %n", name, appointmentCenter.getAppointmentDate());
                }
            });
            thread.start();
        }


    }
}
