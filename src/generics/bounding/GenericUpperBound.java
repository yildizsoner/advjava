package generics.bounding;

public class GenericUpperBound <T extends Number> { // !!! ustten sinirliyoruz.
    private T [] numberArray;

    //constructor


    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    // array icindeki degerlerin ortalamasini bulan method:

    public double getAverage () {
        double sum =0;
        for(T t: numberArray) {
            sum+= t.doubleValue();  //double tipine dondurur.
        }
        double avg = sum/ numberArray.length;
        return avg;
    }

    public static void main(String[] args) {
        Integer[] intArray ={2,4,7,33};
        GenericUpperBound<Integer> obj1 =new GenericUpperBound<>(intArray);
        System.out.println(obj1.getAverage());

        Double[] doubleArray ={2.5,4.6,6.3};
        GenericUpperBound<Double> obj2 =new GenericUpperBound<>(doubleArray);
        System.out.println(obj2.getAverage());

        //String[] strArray = { "Java","Cok","Kolay"};
        //GenericUpperBound<String> obj2 =new GenericUpperBound<>();

    }

}
