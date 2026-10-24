package model;

public class Produto {
    public String nome;
    public double preco;
    public int qtdEstoque;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0;
        this.qtdEstoque = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = 0;
    }

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + qtdEstoque + " Un.");
        System.out.println("--------------------------");
    }
}
