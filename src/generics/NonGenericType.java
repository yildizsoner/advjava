package generics;

public class NonGenericType {

    private Object o;

    // getter -setter
    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        NonGenericType obj1 = new NonGenericType();
        NonGenericType obj2 = new NonGenericType();

        obj1.setO("Mirac");  // String ile set edildi.
        obj2.setO(65);

        String str1 = (String)obj1.getO();  // !! CAST problemi
        System.out.println(str1);

        String str2 = (String)obj2.getO();  // !!! RunTimeException --> ClassCastException

        // String valueOf(obj2.getO()); method ile donusum yapariz.
        // Integer parseInt(String);
        System.out.println(str2);



    }

}
