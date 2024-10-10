import java.util.ArrayList;
import java.util.List;

class Estoque {
    public void exibirPrecosComDesconto(List<Produto> produtos, double porcentagemDesconto) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagemDesconto);
            System.out.println(produto.getNome() + " - R$ " + precoComDesconto);
        }
    }
    private List<Produto> produtosDisponiveis;

    public Estoque() {
        produtosDisponiveis = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtosDisponiveis.add(produto);
        System.out.println(produto.getNome() + " foi adicionado ao estoque.");
    }

    public void removerProduto(Produto produto) {
        produtosDisponiveis.remove(produto);
        System.out.println(produto.getNome() + " foi removido do estoque.");
    }

    public void exibirPrecosComDesconto(double porcentagemDesconto) {
        for (Produto produto : produtosDisponiveis) {
            double precoComDesconto = produto.calcularDesconto(porcentagemDesconto);
            System.out.println(produto.getNome() + " - Preço com desconto: R$ " + precoComDesconto);
        }
    }

    public List<Produto> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    public void setProdutosDisponiveis(List<Produto> produtosDisponiveis) {
        this.produtosDisponiveis = produtosDisponiveis;
    }
}