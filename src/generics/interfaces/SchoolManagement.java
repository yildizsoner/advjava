package generics.interfaces;

import java.util.ArrayList;
import java.util.List;

/*Task: Okul yönetimi için öğrenci ve öğretmen kayıtlarını
   -oluşturan
   -görüntüleyen
   -güncelleyen
   -silen
   bir program yazınız.

   Her iki sinif icin atni methodlara ihtiyacimiz var (add,delete ...)
   implement edip bu methodlari olusturabilmek ve her iki classin nesnelerini parametre olarak alabilmek icin
   generic tipte interface tanimladik.
 */
public class SchoolManagement {
    public static void main(String[] args) {

        Student student = new Student("Tolstoy");
        StudentRepo studentRepo =new StudentRepo();
        Teacher teacher=new Teacher("Dostoyevski");
        TeacherRepo teacherRepo = new TeacherRepo();
       // List<Teacher> teacherList = new ArrayList<>();

        studentRepo.add(student);
        studentRepo.update(student);
        studentRepo.get(student);
        studentRepo.delete(student);

        System.out.println();

        teacherRepo.add(teacher);
        teacherRepo.update(teacher);
        teacherRepo.get(teacher);
        teacherRepo.delete(teacher);

    }




}