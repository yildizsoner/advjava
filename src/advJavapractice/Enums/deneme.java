package advJavapractice.Enums;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AnotherReader anotherReader = new AnotherReader(scan);
        anotherReader.readSomething();
    }
}
class AnotherReader {
    Scanner scan;

    public AnotherReader(Scanner scan){
        this.scan = scan;
}

    public void readSomething(){
        String line = scan.nextLine();
        // Do something

    }
}