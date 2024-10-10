import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Produtos tipo 1 tem um máximo de 50% de desconto, produtos tipo 2 tem um máximo de 10% de desconto");
            System.out.println("Digite o tipo de produto (1 ou 2): ");
            int tipo = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            Produto produto;

            if (tipo == 1) {
                produto = new Tipo1(nome, preco);
            } else if (tipo == 2) {
                produto = new Tipo2(nome, preco);
            } else {
                System.out.println("Tipo de produto inválido.");
                continue;
            }

            estoque.adicionarProduto(produto);

            System.out.println("Deseja adicionar outro produto? (s/n)");
            char resposta = sc.next().charAt(0);
            continuar = (resposta == 's' || resposta == 'S');
        }

        System.out.println("Digite a porcentagem de desconto a ser aplicada: ");
        double porcentagemDesconto = sc.nextDouble();

        System.out.println("Preços com " + porcentagemDesconto + "% de desconto:");
        estoque.exibirPrecosComDesconto(porcentagemDesconto);

        continuar = true;
        while (continuar) {
            System.out.println("\nDeseja remover algum produto? (s/n)");
            char resposta = sc.next().charAt(0);

            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
                break;
            }

            System.out.println("\nProdutos disponíveis:");
            for (int i = 0; i < estoque.getProdutosDisponiveis().size(); i++) {
                Produto produto = estoque.getProdutosDisponiveis().get(i);
                System.out.println((i + 1) + ". " + produto.getNome());
            }

            System.out.println("Digite o número do produto que deseja remover:");
            int indice = sc.nextInt();

            if (indice > 0 && indice <= estoque.getProdutosDisponiveis().size()) {
                Produto produtoRemover = estoque.getProdutosDisponiveis().get(indice - 1);
                estoque.removerProduto(produtoRemover);
            } else {
                System.out.println("Número inválido.");
            }
        }

        System.out.println("\nLista final de produtos com desconto:");
        estoque.exibirPrecosComDesconto(porcentagemDesconto);

        sc.close(); 
    }
}