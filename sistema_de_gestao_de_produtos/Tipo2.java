package sistema_de_gestao_de_produtos;

class Tipo2 extends Produto {

    public Tipo2(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (porcentagem > 10) {
            porcentagem = 10;
        }
        return preco - (preco * (porcentagem / 100));
    }
}