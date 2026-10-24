package view;
import model.*;
public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new Pagamento();
        PagamentoCartao p2 = new PagamentoCartao();
        PagamentoBoleto p3 = new PagamentoBoleto();

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
    }
}
