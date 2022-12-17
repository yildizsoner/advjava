package advJavapractice.interfaces;

public class StudentRepo implements Repository <Student> {

    @Override
    public void add(Student student) {
        System.out.println(student.getName()+"basariyla kaydedildi");
    }

    @Override
    public void get(Student student) {
        System.out.println(student.getName()+"basariyla bulundu");
    }

    @Override
    public void update(Student student) {
        System.out.println(student.getName()+"basariyla update edildi"+student.getName()+"Update");
    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getName()+"basariyla silindi");
    }
}
