public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao();
        pagamento.pagar();

        pagamento = new PagamenotBoleto();
        pagamento.pagar();
    }
}