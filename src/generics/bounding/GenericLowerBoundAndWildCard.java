package generics.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildCard {
    public static void main(String[] args) {

        List<Object> ol = new ArrayList<>();
        addElements(ol);

        List<Number> nl = new ArrayList<>();
        addElements(nl);

//        List<Double> dl = new ArrayList<>();
//        //addElements(dl);   //CTE ,Generic oncesi yapilarda RTE olurdu.

        // **********printElements method*********
//        List<String> st =new ArrayList<>();
//        printElements(st);
        printElements(new ArrayList<String>());

        //---------printobj:----
        List<String> strList = new ArrayList<>();
        //printObj(strList);

        List<Object> objectList = new ArrayList<>();
        printObj(objectList);

    }

    // super Integer ---> bana integer in parentlerini getir.
    public static void addElements(List<? super Integer> list) {

        //? : WildCard (tipi bilinmeyen)
        for (int i = 1; i <= 10; i++) {
            list.add(i);

        }

    }

    // WildCard sinirlamalari...

    public static void printElements(List<?> listOfUnknown) {
        // listOfUnknown.add("Java");  ---> ? dan dolayi data turu netlesmeden add(); methodu gibi is
        //islemleri yaptirmaz

        //listOfUnknown.add(null); // illa eklenecekse null eklenebilir.
        for (Object object : listOfUnknown) {
            System.out.println(object);
        }


    }

    public static void printObj(List<Object> listOfObject) {
        listOfObject.add("Java");
        for (Object object : listOfObject) {
            System.out.println(object);
        }
    }

}
