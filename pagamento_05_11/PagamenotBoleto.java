package pagamento_05_11;

public class PagamenotBoleto extends Pagamento{
    @Override
    public void pagar(){
        System.out.println("Pagamento realizado no boleto");
    }
}
