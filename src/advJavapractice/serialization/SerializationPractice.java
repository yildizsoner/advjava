package advJavapractice.serialization;


//Book tippinde nesneler uretip bu nesneleri
// book.txt dosyaasina kaydedin ve sonra bu dosyadan nesneleri okuyun.

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
       // writeObject();
        readObject();

    }

    public static void writeObject() {

        Book book1 = new Book("Sefiller", "Victor Hugo", 1945);
        Book book2 = new Book("Suc ve Ceza", "Dsotoyevski", 1955);
        Book book3 = new Book("Savas ve baris", "Tolstoy", 1940);

        // nesneleri yazdiracagimiz dosyayi yazdirmak icin:
        try {
            FileOutputStream fos = new FileOutputStream("books.txt");
            // nesneleri yazdirmak icin kullanilir.
            ObjectOutputStream write = new ObjectOutputStream(fos);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close(); // stream de kapatmak gerekir
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readObject() {
        // nesneleri okuyacagimiz dosyayi okur
        try {
            FileInputStream fis = new FileInputStream("books.txt");
            // nesneleri okumak icin
            ObjectInputStream read = new ObjectInputStream(fis);
            Book book1 = (Book)read.readObject();
            Book book2 = (Book)read.readObject();
            Book book3 = (Book)read.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

            read.close();  //stream oldugunda close yapiyoruz.
            fis.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }




}
