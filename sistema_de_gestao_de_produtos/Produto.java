package sistema_de_gestao_de_produtos;

abstract class Produto {

    protected String nome;
    protected double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public abstract double calcularDesconto(double porcentagem);


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

}