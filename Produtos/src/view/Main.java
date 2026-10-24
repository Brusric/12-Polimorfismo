package view;
import model.*;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno");
        Produto p2 = new Produto("Borracha", 1.99);
        Produto p3 = new Produto("Lápis", 2.50, 25);

        System.out.println("=========Produtos=========");
        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
    }
}
