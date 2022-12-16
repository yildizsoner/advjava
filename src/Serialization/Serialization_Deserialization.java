package Serialization;

import java.io.*;

public class Serialization_Deserialization {
    public static void main(String[] args) {
        //writeObjects();  // serialization
        readObjects();  // deserialization


    }

    //writeObject();
    private static void writeObjects() {
        System.out.println("User objectleri olusturuluyor");
        User user1 = new User(1L, "Burak", "1234889978");
        User user2 = new User(1L, "Yusuf", "1565456778");
        User user3 = new User(1L, "Memet", "1288677800");

        try (FileOutputStream fos = new FileOutputStream("user.dat")) { // bu dosya yazmak icin
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {  // objectleri yazmak icin
                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.writeObject(user2);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // readObject();
    private static void readObjects() {
        // Java da File islemlerinde okuma islemi yaparken FileInputStream class i kullanilir.
        try (FileInputStream fis = new FileInputStream("user.dat")) { //okunacak dosya belirlendi
            try (ObjectInputStream ois = new ObjectInputStream(fis)) { // object olarak okunacak
                User user1 = (User) ois.readObject();
                User user2 = (User) ois.readObject();
                User user3 = (User) ois.readObject();
                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

// user classini tranfer edilebilsin diye isaretledik.
class User implements Serializable {

    // private field
    private Long id;
    private String name;
    private String tcKimlikNo;

    // constructor:
    public User(Long id, String name, String tcKimlikNo) {
        this.id = id;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
    }
//getter -setter :


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    @Override
    public String toString() {   // objectin fieldlerini bu sekilde goruyoruz. objectleri sout ile bu sekilde gelsin diye..
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }


}