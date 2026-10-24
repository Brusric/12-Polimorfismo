package model;

public class Conversor {
    public double fahrenheit, celcius, miles;
    public int km;
    public String texto;

    public void converter(double celsius){
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("------------------------------");
    }

    public void converter(int km) {
        miles = km * 0.621371;
        System.out.println("Quilômetros: " + km);
        System.out.println("Milhas: " + miles);
        System.out.println("------------------------------");
    }

    public void converter(String texto) {
        System.out.println("Texto: " +  texto);
        System.out.println("Texto Maiúsculo: " + texto.toUpperCase());
        System.out.println("------------------------------");
    }
}
