package view;
import model.*;
public class Main {
    public static void main(String[] args) {
        Conversor c1 = new Conversor();
        Conversor c2 = new Conversor();
        Conversor c3 = new Conversor();

        System.out.println("===========CONVERSOR===========");

        c1.converter(10.2);
        c2.converter(10);
        c3.converter("Hello World!");
    }
}
