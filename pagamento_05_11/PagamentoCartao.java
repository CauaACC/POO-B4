package pagamento_05_11;

public class PagamentoCartao extends Pagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado no cartão");
    }
}
